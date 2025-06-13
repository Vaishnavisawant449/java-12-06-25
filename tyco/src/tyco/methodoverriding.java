package tyco;
class Employee{
void msg(int empid,int a) {
	System.out.println("parent class data"+empid);
}
}
public class methodoverriding extends Employee {
	void show (int empid) {
		System.out.println("child class data"+empid);
	}
	
	

	public static void main(String[] args) {
		methodoverriding m=new methodoverriding() ;
		m.msg(30,20 );

	}

}
