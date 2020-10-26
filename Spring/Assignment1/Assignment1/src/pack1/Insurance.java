package pack1;

import org.springframework.beans.factory.annotation.Required;

public class Insurance {
	public int id;
	public String name;
	public int amount;
	public int getId() {
		return id;
	}
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	@Required
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
