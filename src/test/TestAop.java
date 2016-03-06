

import controller.Employee;
import controller.PersonInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiaozhongbao
 * @date 16-3-6
 */

public class TestAop {
             @Test
 public void testAop(){
        ApplicationContext ctx= new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Employee employee=(Employee) ctx.getBean("employee");
        System.out.println( employee.toString());
        PersonInfo personInfo=(PersonInfo) ctx.getBean("personInfo");
        personInfo.tellSecrite();
    }

}
