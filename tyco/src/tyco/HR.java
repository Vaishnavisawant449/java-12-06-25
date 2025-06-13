package tyco;

class Employee{
	void msg(int salary,int b) {
		System.out.println("Parent Class Data"+salary);
	}
	
}
public class HR extends Employee {
	void msg(int salary) {
		
		System.out.println("Child Class Data"+salary);

	}
	
	public static void main(String[] args) {
		HR mm=new HR();
		mm.msg(10000);
		

	}

}
