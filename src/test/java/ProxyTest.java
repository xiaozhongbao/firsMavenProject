import com.xzhb.trainTicket.Proxy.HandleImpl;
import com.xzhb.trainTicket.Proxy.ISellTicket;
import com.xzhb.trainTicket.Proxy.RealwayStation;
import com.xzhb.trainTicket.Proxy.StationProxy;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Created by xiao on 2016/6/29.
 */
public class ProxyTest {

    @Test
    public  void testStaticProxy() {
        RealwayStation realwayStation=new RealwayStation();
        ISellTicket iSellTicket=new StationProxy(realwayStation);
        iSellTicket.sellTicket();
    }
    @Test
    public void  testDaynamicProxy(){
        RealwayStation realwayStation   =new RealwayStation();
        HandleImpl handle=new HandleImpl(realwayStation);
        ISellTicket proxy=(ISellTicket) Proxy.newProxyInstance(realwayStation.getClass().getClassLoader(),realwayStation.getClass().getInterfaces(),handle);
        proxy.sellTicket();

    }
}
