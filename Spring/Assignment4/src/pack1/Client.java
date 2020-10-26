package pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Electric obj=(Electric) context.getBean("hello");
		Electric obj2=(Electric) context.getBean("hello");
		obj.setMeter_no(10);
		obj.setInitial(2000);
		obj.setFinal1(3000);
		obj.setColor("Red");
		System.out.println("Meter No: "+obj.getMeter_no()+" Initial: "+obj.getInitial()+" Final: "+obj.getFinal1()+" Color: "+obj.getColor());
		
		
		System.out.println("Meter No: "+obj2.getMeter_no()+" Initial: "+obj2.getInitial()+" Final: "+obj2.getFinal1()+" Color: "+obj2.getColor());
	}

}
