
public class Satellite {
 private int number;
 private String name;
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 public void init() {
	 this.number=20;
	 this.name="Rohini";
	 System.out.println("Bean will initialize");
 }
 public void display() {
	 System.out.println("Number "+this.number+" Name "+this.name);
 }
 public void destroy() {
	 System.out.println("Bean will destroy");
 }
}
