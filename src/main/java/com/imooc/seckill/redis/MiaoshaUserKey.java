package com.imooc.seckill.redis;

/**
 * Created by Kylin_Su on 2018/6/10.
 */
public class MiaoshaUserKey extends BasePrefix{

    public static final int TOKEN_EXPIRE = 3600*24*2;
    private MiaoshaUserKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

    public static MiaoshaUserKey token = new MiaoshaUserKey(TOKEN_EXPIRE,"tk");


    //将expireSeconds设置为0，只要没有发生变化，则永久有效
    public static MiaoshaUserKey getById = new MiaoshaUserKey(0,"id");
}
