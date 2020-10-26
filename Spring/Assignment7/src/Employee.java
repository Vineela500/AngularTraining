
public class Employee {
	private int id;
	 private String name;
	 private String dept;
	 private int salary;
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	 public void init() {
		 this.id=20;
		 this.name="Vineela";
		 this.dept="IT";
		 this.salary=10000;
		 System.out.println("Bean will initialize");
	 }
	 public void destroy() {
		 System.out.println("Bean will destroy");
	 }
}
