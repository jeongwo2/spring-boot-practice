package com.example.springbootpractice.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.cache.RedisCacheConfiguration;
//import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.RedisSerializationContext.SerializationPair;

/**
 * Package Name   : com.example.springbootpractice.config
 * File Name      : CacheConfig
 * Author         : jeong
 * Date           : 2023-04-11
 * Description    : Redis Cache
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-11        jeong       최초 생성
 */
@EnableCaching
@Configuration
public class CacheConfig extends CachingConfigurerSupport {
    private static Logger logger = LoggerFactory.getLogger(CacheConfig.class);
//    @Bean
//    public RedisCacheConfiguration redisCacheConfiguration() {
//        return RedisCacheConfiguration.defaultCacheConfig()
//                .computePrefixWith(name -> name + ":")
//                .entryTtl(Duration.ofSeconds(10))
//                .serializeValuesWith(SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()));
//    }
}
