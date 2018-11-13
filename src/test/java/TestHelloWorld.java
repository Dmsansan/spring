import com.neusoft.spring.action.HelloWorld;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestHelloWorld {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/config.xml");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("HellWorld");
        System.out.print(helloWorld.getMsg());
    }
}
