package tyco;
class Parent1{
	int i=60;
	void msg() {
		System.out.println(i);
	}
	void show() {
		System.out.println("Parent Class");
		
	}
}
public class Inheritence1 extends Parent1 {
	int i=20;
	void msg() {
		System.out.println(super.i);
		System.out.println(i);
	}
	void show() {
		super.show();
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		Inheritence i=new Inheritence();
		i.show();
		i.msg();

	}
}

