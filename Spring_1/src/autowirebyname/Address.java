package autowirebyname;

public class Address {
	
	private int aid;
	 private Employee emp;
	 private EmpDetails ed;
	 
	 
	 public EmpDetails getEd() {
		return ed;
	}
	public void setEd(EmpDetails ed) {
		this.ed = ed;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	 
	
	public void display()
	{
		System.out.println(" "+aid);
		System.out.println("Employee ID"+emp.getId());
		System.out.println(emp.getName());
		
		System.out.println("Employee Details"+ed.getMobile());
	}
	 
	 
	 
}
