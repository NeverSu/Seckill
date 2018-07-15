package com.imooc.seckill.redis;

/**
 * Created by Kylin_Su on 2018/7/5.
 */
public class AccessKey extends BasePrefix {
    private AccessKey(int expireSeconds, String prefix){
        super(expireSeconds, prefix);
    }

    public static AccessKey withExpire(int expireSeconds){
        return new AccessKey(expireSeconds, "access");
    }
}
