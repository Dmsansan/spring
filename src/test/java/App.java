import com.neusoft.spring.aop.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext(new String[] {"config.xml"});
//
//        OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
//        output.generateOutput();
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        CustomerService cust = (CustomerService) context.getBean("customerServiceProxy");

        System.out.println("*************************");
        cust.printName();
        System.out.println("*************************");
        cust.printURL();
        System.out.println("*************************");
        try {
            cust.printThrowException();
        } catch (Exception e) {

        }
    }
}
