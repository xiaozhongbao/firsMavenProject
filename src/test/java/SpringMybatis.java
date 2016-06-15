import com.xzhb.trainTicket.IStudentDao;
import com.xzhb.trainTicket.Student;
import com.xzhb.trainTicket.StudentDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiao on 2016/6/14.
 */
public class SpringMybatis {
    @Test
    public void testSpringMybatis(){
        ApplicationContext ctx=null;
        ctx=new ClassPathXmlApplicationContext("springContext.xml");
      //  IStudentDao iStudentDao=( IStudentDao)ctx.getBean("iStudentDao");
      //  Student student=new Student();
       // student=iStudentDao.getStudent("2012001");
       // System.out.println(student);

        //*************8888
        StudentDaoImpl stu=(StudentDaoImpl)ctx.getBean("studentDaoImpl");
        stu.getStudent("3201090122");
    }
}
