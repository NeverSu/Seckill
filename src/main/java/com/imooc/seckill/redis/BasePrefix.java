package com.imooc.seckill.redis;

/**
 * Created by Kylin_Su on 2018/6/10.
 */
public abstract class BasePrefix implements KeyPrefix {
    private int expireSeconds;
    private String prefix;

    public BasePrefix(int expireSeconds,String prefix){
        this.expireSeconds = expireSeconds;
        this.prefix = prefix;
    }

    public BasePrefix(String prefix){
        //0代表永不过期
        this(0,prefix);
    }

    public int expireSeconds(){
        return expireSeconds;
    }
    public String getPrefix(){
        String className = getClass().getSimpleName();
        return className + ":" + prefix;
    }
}
