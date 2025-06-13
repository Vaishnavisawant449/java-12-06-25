package tyco;
class First{
	First(){
		System.out.println("first class");
	}
	
}
class Second extends First{
	Second(){
		System.out.println("second class");
	}
	
}
public class multilevel extends Second {
	multilevel(){
		System.out.println("multilevel class");
	}
	
	public static void main(String args[]) {
		multilevel m=new multilevel();
		
	}

}
