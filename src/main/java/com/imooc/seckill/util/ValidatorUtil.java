package com.imooc.seckill.util;

import io.netty.util.internal.StringUtil;
import org.thymeleaf.util.StringUtils;
import sun.swing.StringUIClientPropertyKey;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kylin_Su on 2018/6/11.
 */
public class ValidatorUtil {

    private static final Pattern mobile_pattern = Pattern.compile("1\\d{10}");

    public static boolean isMobile(String src){
        if(StringUtils.isEmpty(src)){
            return false;
        }
        Matcher m = mobile_pattern.matcher(src);
        return m.matches();
    }
}
