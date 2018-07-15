package com.imooc.seckill.redis;

/**
 * Created by Kylin_Su on 2018/6/10.
 */
public interface KeyPrefix {
    public int expireSeconds();

    public String getPrefix();
}
