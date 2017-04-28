package autowirebytype;

public class Department {

	private int Dno;
	private String name;
	
	private Employee emp;
	private Category ct;
	
	
	
	public Department(Employee emp, Category ct) {
		
		this.emp = emp;
		this.ct = ct;
		// TODO Auto-generated constructor stub
	}
	
	
	public int getDno() {
		return Dno;
	}
	public void setDno(int dno) {
		Dno = dno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public Category getCt() {
		return ct;
	}
	public void setCt(Category ct) {
		this.ct = ct;
	}
	
	
	
	public void show()
	{
		System.out.println("Employee ID" + emp.getEid());
		System.out.println("Employee Name " + emp.getName());
		System.out.println("Department " +Dno);
		System.out.println("Dep Name"+name); 
		System.out.println("Category "+ct.getName());
		
		System.out.println("JJJJJJ  KKKK");
	}
	
	
}
