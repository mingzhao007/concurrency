package com.mmall.concurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 课程里用来标记【线程安全】的类或者写法
 * Created by HUAWEI on 2019/10/22.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)//注解存在的范围，source编译的时候就会被忽略掉
public @interface ThreadSafe {
    String value() default "";
}
