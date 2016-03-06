package controller;
import java.lang.Override;
import java.lang.String;
import java.lang.System;


public class Hello{
    private String name;
    public void sayHello(){


        System.out.println("hello "+name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }
}