import com.neusoft.spring.action.ChHelloWorld;
import com.neusoft.spring.action.EnHelloWorld;
import com.neusoft.spring.action.EnHelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestHelloWorld {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/config.xml");
        EnHelloWorld helloWorld = (EnHelloWorld) applicationContext.getBean("HellWorld");
        System.out.print(helloWorld.getMsg());
    }
}
