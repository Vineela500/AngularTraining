package pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String args[]) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	Train obj=(Train) context.getBean("hello");
	Train obj1 =(Train) context.getBean("hello");
	Train obj2=(Train) context.getBean("hello");
	Train obj3=(Train) context.getBean("hello");
	obj.setName("Vineela");
	obj.setDeparture("Hyderabad");
	obj.setArrival("Banglore");
	obj1.setName("Rishita");
	obj1.setDeparture("Pune");
	obj1.setArrival("Banglore");
	obj2.setName("Mayank");
	obj2.setDeparture("Kochi");
	obj2.setArrival("Banglore");
	obj3.setName("Roshni");
	obj3.setDeparture("Chennai");
	obj3.setArrival("Banglore");
	System.out.println("Name: "+obj.getName()+" Departure: "+obj.getDeparture()+" Arrival: "+obj.getArrival());
	System.out.println("Name: "+obj1.getName()+" Departure: "+obj1.getDeparture()+" Arrival: "+obj1.getArrival());
	System.out.println("Name: "+obj2.getName()+" Departure: "+obj2.getDeparture()+" Arrival: "+obj2.getArrival());
	System.out.println("Name: "+obj3.getName()+" Departure: "+obj3.getDeparture()+" Arrival: "+obj3.getArrival());
	}

}
