import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String args[]) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee obj=(Employee) context.getBean("hello");
		System.out.println("Name: "+obj.getName()+" ID: "+obj.getId()+" Dept: "+obj.getDept()+" Salary: "+obj.getSalary());
	    context.registerShutdownHook();
	}
}
