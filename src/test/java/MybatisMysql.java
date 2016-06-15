import com.xzhb.trainTicket.IStudentDao;
import com.xzhb.trainTicket.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by xiao on 2016/6/14.
 */
public class MybatisMysql {
    @Test
    public void testMybatis(){
        String resource = "mybatisConfi.xml";

        Reader reader =null;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(reader);

            SqlSession session = factory.openSession();
            IStudentDao iStudentDao=session.getMapper(IStudentDao.class);
            Student student=new Student();
            student=iStudentDao.getStudent("3201090122");
            System.out.println(student);
           // student.setName("xiao");
          //  student.setNo("3201090122");
         //   iStudentDao.insertStudent(student);
         //   System.out.println(student);
            session.commit();
            session.close();
        }catch (Exception e)
        {
           e.printStackTrace();
        }
        finally {
            reader=null;

        }



    }

}
