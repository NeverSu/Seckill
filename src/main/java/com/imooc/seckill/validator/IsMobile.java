package com.imooc.seckill.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Kylin_Su on 2018/6/11.
 */


        @Target({METHOD,FIELD,ANNOTATION_TYPE,CONSTRUCTOR,PARAMETER})
        @Retention(RUNTIME)
        @Documented
        @Constraint(validatedBy = {IsMobileValidator.class})
        public @interface IsMobile{
            boolean required() default true;

            String message() default "手机号码错误";

            Class<?>[] groups() default {};

            Class<? extends Payload>[] payload() default {};
        }
