package tyco;

import java.util.concurrent.atomic.AtomicInteger;

public class Wrapper1_Class {

public static void main(String args[]) {
int a=60;
  Integer j=Integer.valueOf(a);
  
  int b=j.intValue();
  float f=70.5f;
  Float f1=new Float(70.4f);
  
  String s="70";
  String s1="10";
  
  int p=Integer.parseInt(s);
  int m=Integer.parseInt(s1);
  
  int add=p+m;
  
  System.out.println(add);
}
}
