package com.imooc.seckill.access;

import com.imooc.seckill.domain.MiaoshaUser;

/**
 * Created by Kylin_Su on 2018/7/5.
 */
public class UserContext {

    //ThreadLocal是多线程时保证线程安全的一种方式，它是和当前线程绑定的，
    //即，只对当前线程进行操作
    private static ThreadLocal<MiaoshaUser> userHolder = new ThreadLocal<MiaoshaUser>();

    public static void setUser(MiaoshaUser user) {
        userHolder.set(user);
    }

    public static MiaoshaUser getUser() {
        return userHolder.get();
    }
}
