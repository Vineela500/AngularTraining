package pack1;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String args[]) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Flight obj=(Flight) context.getBean("hello");
		Scanner sr=new Scanner(System.in);
		String name=sr.next();
		String dep=sr.next();
		String arrival=sr.next();
		int budget=sr.nextInt();
		sr.close();
		obj.setName(name);
		obj.setDeparture(dep);
		obj.setArrival(arrival);
		obj.setBudget(budget);
		System.out.println("Name: "+obj.getName()+" Depart from: "+obj.getDeparture()+" Arrive at: "+obj.getArrival()+" Budget: "+obj.getBudget());
		
		
	}

}
