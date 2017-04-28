package com.container;

public class Student {
	
	private String name;
	private String adds;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdds() {
		return adds;
	}

	public void setAdds(String adds) {
		this.adds = adds;
	}

	public void display()
	{
		System.out.println("Name ="+name);
		System.out.println("Address ="+adds);
	}
	

}
