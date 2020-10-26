import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Car obj=(Car) context.getBean("hello");
		obj.setTyres("Ceat");
		obj.setColor("Black");
		BMW obj1=(BMW) context.getBean("hello2");
		obj1.setCost(400000);
		obj1.setName("BMW");
		Audi obj2=(Audi) context.getBean("hello1");
		obj2.setCost(450000);
		obj2.setName("Audi");
		System.out.println("Tyre company "+obj2.getTyres()+" Color "+obj2.getColor()+" name "+obj2.getName()+" Cost "+obj2.getCost());
		System.out.println("Tyre company "+obj1.getTyres()+" Color "+obj1.getColor()+" name "+obj1.getName()+" Cost "+obj1.getCost());
	}
}
