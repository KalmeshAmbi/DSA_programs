package OOPs.AccessControl;

public class Main {
 public static void main(String[] args) {
	 ClassA a = new ClassA();
	 a.setNum(10);
	 //a.num; -- >  num is private in  class
	System.out.println( a.getNum());
 }
 
}
