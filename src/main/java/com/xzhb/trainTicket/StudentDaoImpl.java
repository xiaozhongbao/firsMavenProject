package com.xzhb.trainTicket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiao on 2016/6/14.
 */
@Service("studentDaoImpl")
public class StudentDaoImpl {
  @Autowired
    IStudentDao iStudentDao;
    public void getStudent(String no){
      Student s=  iStudentDao.getStudent(no);
        System.out.println(s.toString());
    }
}
