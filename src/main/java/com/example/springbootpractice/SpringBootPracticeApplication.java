package com.example.springbootpractice;

import com.example.springbootpractice.properties.MyProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

/**
 * Package Name   : com.example.springbootpractice
 * File Name      : SpringBootPracticeApplication
 * Author         : jeong
 * Date           : 2023-04-11
 * Description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-11        jeong       최초 생성
 */
@ConfigurationPropertiesScan
@SpringBootApplication
//        ( exclude = WebMvcAutoConfiguration.class )
public class SpringBootPracticeApplication {
    @Value("${my.height}")
    private final Integer height ;    // final 를 사용하면 에러>생성사 작성
    private final Environment environment;
    private final ApplicationContext applicationContext;
    private final MyProperties myProperties;
//    private final StudentService studentService;
//    private final String username;
//    private final String password;

    // final 을 사용하기 위해 생성자
     public SpringBootPracticeApplication(@Value("${my.height}") Integer height,
                                          Environment environment,
                                          ApplicationContext applicationContext ,
                                          MyProperties myProperties)
    {
        this.height = height ;
        this.environment = environment ;
        this.applicationContext = applicationContext ;
        this.myProperties = myProperties;
    }
    public static void main(String[] args) {

        SpringApplication.run(SpringBootPracticeApplication.class, args);
        // 이 경우는 생성자 이전에 값이 출력 되므로 null 로 출력 된다.
    }
    // ${my.height} null
    public void printHeight(){
        printProperty();
    }
    // 생성자가 만들어 진 후에  ${my.height} 175 출력
    @PostConstruct
    public void initHeight(){
        printProperty();
    }
    private void printProperty() {
        System.out.println("[${my.height}] " + height );
        System.out.println("[Environment] " + environment.getProperty("my.height") );
        System.out.println("[ApplicationContext] " + applicationContext.getEnvironment().getProperty("my.height") );
        System.out.println("[ConfigurationProperties] " + myProperties.getHeight() );
    }


//    public SpringBootPracticeApplication(
//            MyProperties myProperties,
//            StudentService studentService,
//            @Value("${spring.datasource.username:vault가}") String username,
//            @Value("${spring.datasource.password:꺼져 있어요}") String password
//    ) {
//        this.myProperties = myProperties;
//        this.studentService = studentService;
//        this.username = username;
//        this.password = password;
//    }
//
//    @Bean
//    public ApplicationRunner applicationRunner() {
//        return args -> {
//            System.out.println("내 키는: " + myProperties.getHeight());
//            studentService.printStudent("jack");
//            studentService.printStudent("jack");
//            studentService.printStudent("jack");
//            studentService.printStudent("fred");
//            studentService.printStudent("cassie");
//            studentService.printStudent("cassie");
//            System.out.println("user: " + username);
//            System.out.println("pw: " + password);
//        };
//    }
}
