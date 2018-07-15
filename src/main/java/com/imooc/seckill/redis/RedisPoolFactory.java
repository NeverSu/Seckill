package com.imooc.seckill.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by Kylin_Su on 2018/6/10.
 */
@Service
public class RedisPoolFactory {

    private JedisPool pool;
    @Autowired
    RedisConfig redisConfig;

    @Bean
    private JedisPool JedisPoolFactory(){
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxIdle(redisConfig.getPoolMaxIdle());
        poolConfig.setMaxTotal(redisConfig.getPoolMaxTotal());
        poolConfig.setMaxWaitMillis(redisConfig.getPoolMaxWait() * 1000);
        pool = new JedisPool(poolConfig,redisConfig.getHost(),redisConfig.getPort(),
                redisConfig.getTimeout()*1000,redisConfig.getPassword(),0);
        return pool;
    }
}
