package com.xzhb.trainTicket;

/**
 * Created by xiao on 2016/6/14.
 */
public interface IStudentDao {
    Student getStudent(String no);
    void insertStudent(Student student);
}
