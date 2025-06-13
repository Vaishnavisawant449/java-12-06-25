package tyco;

public class MethodOverloading2 {
	void show(int a)
	{
		System.out.println(a);
	}
	

	void show(int a,int b) 
	{
		System.out.println(a+" "+b);
	}
	void show(int a,String b) 
	{
		System.out.println(a+" "+b);
	}


	public static void main(String[] args) {
		MethodOverloading2 m=new MethodOverloading2();
		m.show(20);
		m.show(12, 60);
		m.show(14, "VVIT");

	}

}
