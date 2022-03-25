package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// @Component 组件 等价于<bean id="user" class="com.kuang.pojo.User"/>
@Component
//@Scope 作用域，设置为单例 singleton，原型模式 prototype
@Scope("singleton")
public class User {
    // Value 相当于  <property name="name" value="张三"/>
    @Value("张三")
    public String name;
}
