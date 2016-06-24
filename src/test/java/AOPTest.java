import com.xzhb.trainTicket.AOP.ArithmeticCaculatorImpl;
import com.xzhb.trainTicket.AOP.IArithmetiaCaculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xiao on 2016/6/22.
 */
public class AOPTest {
    @Test
    public void testBefore() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springContext.xml");
    IArithmetiaCaculator   ar = (IArithmetiaCaculator) ctx.getBean("arithmeticCaculatorImpl");
      int res=  ar.add(5,4);
        System.out.println("result is:" +res);
    }

}
