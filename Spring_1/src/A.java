
public class A {
	static int i=0;
	public void m(){
		i+=i;
		System.out.println(i);

			System.out.println("i did some changed");


	}
	public static void main(String[] args) {
		System.out.println(i);
		A a= new A();
		a.m();
		System.out.println("satshed changed");
	}
}
