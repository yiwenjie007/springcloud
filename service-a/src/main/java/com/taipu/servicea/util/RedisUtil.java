package com.taipu.servicea.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisUtil {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    public void setValue(String key,String value){
        stringRedisTemplate.opsForValue().set(key,value);
        //redisTemplate.opsForValue().set(key,value);
    }

    public String getValue(String key){
        return stringRedisTemplate.opsForValue().get(key);
//        Object value = redisTemplate.opsForValue().get(key);
//        return value.toString();
    }
}
