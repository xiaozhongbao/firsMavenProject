package com.xzhb.trainTicket.Proxy;
import  static  java.lang.System.out;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by xiao on 2016/6/29.
 */
public class HandleImpl implements InvocationHandler {
    private Object target;

    public HandleImpl(Object target) {
        this.target = target;
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        out.println("daynamic proxy begain to work");
    Object result=    method.invoke(target,args);
        out.println("daynamic proxy ends");
        return  result;

    }
}
