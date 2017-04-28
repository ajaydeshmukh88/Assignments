package coreset;

import java.util.Set;

public class Student {
	
	private int sid;
	private String name;
	
	private Set ans;
	
	public Set getAns() {
		return ans;
	}
	public void setAns(Set ans) {
		this.ans = ans;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void display()
	{
		System.out.println("Student ID =" +sid);
		System.out.println("Student Name =" +name);
		System.out.println("Ans = "+ ans);
		
	}

}
