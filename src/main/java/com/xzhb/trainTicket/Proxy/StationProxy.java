package com.xzhb.trainTicket.Proxy;
import  static  java.lang.System.out;
/**
 * Created by xiao on 2016/6/29.
 */
public class StationProxy implements ISellTicket {
   RealwayStation realwayStation;

    public StationProxy(RealwayStation realwayStation) {
        this.realwayStation = realwayStation;
    }

    public void sellTicket() {
        out.println("station proxy begain sell");
        realwayStation.sellTicket();
    }
}
