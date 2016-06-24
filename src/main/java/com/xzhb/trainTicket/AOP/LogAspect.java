package com.xzhb.trainTicket.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


/**
 * Created by xiao on 2016/6/22.
 */
@Aspect
@Component
public class LogAspect {
    @Before("execution( * com.xzhb.trainTicket.AOP.IArithmetiaCaculator.add(int, int))")
    public void beforeMethod(){
        System.out.println("the method begins");

    }
}
