import com.neusoft.spring.jdbc.CusTomerDao;
import com.neusoft.spring.jdbc.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CusTomerDao customerDAO = (CusTomerDao) context.getBean("customerDAO");
        Customer customer = new Customer(1,"aa",20);
        customerDAO.insert(customer);

        Customer customer1 = customerDAO.findByCustomerId(1);
        System.out.println(customer1);
    }
}
