package com.xzhb.trainTicket;

/**
 * Created by xiao on 2016/6/14.
 */
public interface IUser {
    void createTable();
    int insertUser(UserInfo userInfo);
    UserInfo getUser(int id);
}
