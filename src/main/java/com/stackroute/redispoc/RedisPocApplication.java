package com.stackroute.redispoc;

import com.stackroute.redispoc.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
@EnableCaching
public class RedisPocApplication {

//    @Bean
//    JedisConnectionFactory jedisConnectionFactory(){
//        return new JedisConnectionFactory();
//    }
//
//    @Bean
//    RedisTemplate<String, User> redisTemplate() {
//        RedisTemplate<String, User> redisTemplate = new RedisTemplate<>();
//        redisTemplate.setConnectionFactory(jedisConnectionFactory());
//        return redisTemplate;
//    }
//    @Bean
//    public JedisConnectionFactory connectionFactory() {
//    JedisConnectionFactory connection = new JedisConnectionFactory();
//    connection.setHostName("redis");
//    return connection;
//    }


    public static void main(String[] args) {
		SpringApplication.run(RedisPocApplication.class, args);
	}

}
