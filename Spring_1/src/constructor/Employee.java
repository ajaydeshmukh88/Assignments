package constructor;

public class Employee {
	
	private int id;  
	private String name;  
	private Address address;  
	  
	public Employee() {
		System.out.println("def cons");
		}  
	  
	public Employee(int id, String name, Address address) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	    System.out.println(2);
	}  
	  
	void show(){  
		System.out.println(4); 
	    System.out.println(id+" "+name);  
	    System.out.println(address.toString());  
	}  
	  


}
