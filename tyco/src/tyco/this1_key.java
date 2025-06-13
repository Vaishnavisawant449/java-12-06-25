package tyco;

public class this1_key {

 int no;
 public this1_key(int no) {
	 //this();
	 this.no=no;
 }
 public this1_key() {
	 this(30);
	 System.out.println("default constructor..");
 }
 void m() {
	 System.out.println("calling m...");
 }
 void show() {
	 this.m();
	 System.out.println("no");
 }
 public static void main(String[]args) {
	 this_key t=new this_key();
	 
	 t.show();
 }
 
	 
 }
	 
 
