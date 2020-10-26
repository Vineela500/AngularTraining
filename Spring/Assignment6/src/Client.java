import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String args[]) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Satellite obj=(Satellite) context.getBean("hello");
		obj.display();
		context.registerShutdownHook();		
	}
}
