package com.imooc.seckill.util;

import java.util.UUID;

/**
 * Created by Kylin_Su on 2018/6/11.
 */
public class UUIDUtil {
    public static String uuid(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
