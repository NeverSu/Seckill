package com.imooc.seckill.redis;

/**
 * Created by Kylin_Su on 2018/6/10.
 */
public class OrderKey extends BasePrefix {
    public OrderKey( String prefix) {
        super( prefix);
    }
    public static OrderKey getMiaoshaOrderByUidGid = new OrderKey("moug");
}
