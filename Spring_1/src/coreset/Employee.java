package coreset;

import java.util.Iterator;
import java.util.List;

public class Employee {

	private int ID;
	
	private List name;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public List getName() {
		return name;
	}

	public void setName(List name) {
		this.name = name;
	}
	
	
	public void display()
	{
		
		System.out.println("Id = "+ ID);
		System.out.println("Name = "+ name);
	}
	
	
	
	
}
