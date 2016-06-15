package com.xzhb.trainTicket;

/**
 * Created by xiao on 2016/6/14.
 */
public class Student {
    private  String  no;
    private String name;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
