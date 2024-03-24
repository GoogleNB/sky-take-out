package com.sky.annotation;


//  自定义填充，用于定义某个方法进行功能字段自动填充


import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //用于表示此注解作用于方法之上
@Retention(RetentionPolicy.RUNTIME)//标识为运行时注解
public @interface AutoFill {
    //指定数据库类型 UPDATE INSERT
    OperationType value();


}
