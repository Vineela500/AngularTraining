package pack1;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
 public static void main(String args[]) {
	 ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	 Employee obj=(Employee) context.getBean("hello");
	 Employee obj2=(Employee) context.getBean("hello1");
	 Employee obj3=(Employee) context.getBean("hello2");
	 ArrayList<Employee> arr=new ArrayList<Employee>();
	     obj.setId(10);
	     obj.setName("Vineela");
	     obj.setDept("IT");
	    
	     obj.setSalary(100000);
	     
	     obj2.setId(20);
	     obj2.setName("Rishita");
	     obj2.setDept("IT");
	     obj2.setSalary(10000);
	    // System.out.println(obj2);
	     obj3.setId(25);
	     obj3.setName("Mayank");
	     obj3.setDept("IT");
	     obj3.setSalary(600000);
	   
		 arr.add(obj);
		// System.out.println(arr.get(arr.size()-1));
		 arr.add(obj2);
		 //System.out.println(arr.get(arr.size()-1));
		 arr.add(obj3);
		 for(int i=0;i<arr.size();i++) {
			 //System.out.println(arr.get(i));
			 if(arr.get(i).getSalary()>50000) {
			 System.out.println("Name: "+arr.get(i).getName()+" ID: "+arr.get(i).getId()+" Dept: "+arr.get(i).getDept()+" Salary: "+arr.get(i).getSalary());
			 }
		 }
	 
 }
}
