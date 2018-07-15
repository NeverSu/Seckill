package com.imooc.seckill.redis;

import com.fasterxml.jackson.databind.ser.Serializers;

/**
 * Created by Kylin_Su on 2018/6/20.
 */
public class GoodsKey extends BasePrefix{

    private GoodsKey(int expireSeconds, String prefix){
        super(expireSeconds, prefix);
    }

    public static GoodsKey getGoodsList = new GoodsKey(60,"gl");
    public static GoodsKey getGoodsDetail = new GoodsKey(60, "gd");
    public static GoodsKey getMiaoshaGoodsStrock = new GoodsKey(0,"gs");
}
