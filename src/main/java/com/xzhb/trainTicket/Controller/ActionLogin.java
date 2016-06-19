package com.xzhb.trainTicket.Controller;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Service;

/**
 * Created by xiao on 2016/6/15.
 */
@Service
public class ActionLogin extends ActionSupport {//
        String username;
        String password;
    public String execute(){

        return SUCCESS ;// "success";
    }

    public void validate(){
        if (getUsername()==null|| getPassword()==null)
        {    addFieldError("NULL POINTER","PLEASE INPUT") ;
            return;
        }
        System.out.println(getUsername() +getPassword());
        if (!getUsername().equals("xzhb")) {
            addFieldError("username", getUsername()+": username is wrong");

        }
        else if (!getPassword().equals("123456"))
            addFieldError("password","password is wrong") ;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
