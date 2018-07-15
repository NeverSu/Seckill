package com.imooc.seckill.redis;

/**
 * Created by Kylin_Su on 2018/6/10.
 */
public class UserKey extends BasePrefix {

    public UserKey(String prefix) {
        super(prefix);
    }

    public static UserKey getById = new UserKey("id");
    public static UserKey getByName = new UserKey("name");
}
