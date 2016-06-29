package com.xzhb.trainTicket.Proxy;
import  static  java.lang.System.out;

/**
 * Created by xiao on 2016/6/29.
 */
public class RealwayStation implements ISellTicket {
    public void sellTicket() {
        out.println("realway station sell ticket");
    }
}
