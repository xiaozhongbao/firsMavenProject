package com.xzhb.trainTicket.AOP;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by xiao on 2016/6/22.
 */
@Component
public class ArithmeticCaculatorImpl implements IArithmetiaCaculator {

    public ArithmeticCaculatorImpl() {
    }

    public int add(int i, int j) {
        System.out.println("add exexute..");
        return i+j;
    }
}
