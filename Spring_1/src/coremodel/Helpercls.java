package coremodel;

public class Helpercls {

	A a;
	  
	public Helpercls() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor");
		
	} 
	
	public void outPut()
	{
		a.display();
	}

	
	public void setA(A a) {
		this.a = a;
		
		System.out.println("Setter Method");
	}
	
	

}
