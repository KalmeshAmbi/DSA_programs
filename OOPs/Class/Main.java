package OOPs.Class;
class Main{
    public static void main(String[] args) {
        // Student student1 = new Student(1,"kalmesh",50.5);
        // Student student2 = new Student();
        // System.out.println(student1.name);
        // System.out.println(student1.r_no);
        // System.out.println(student1.perc);
        // Student kalmesh = new Student(student1);
        // System.out.println(kalmesh.name);
        // System.out.println(kalmesh.r_no);
        // System.out.println(kalmesh.perc);
        // System.out.println(student2.name);
        // System.out.println(student2.r_no);
        // System.out.println(student2.perc);
// Final Keyword using 
        final Student one = new Student();
        Student two = one;
        one.name = "ravi";// this is allowed in  non premitive data type having final
        // one = Student(); --> not allowed throw an error ,we can't reassign the object
        System.out.println(one.name);
// Garbage collection 
    // protected void finalize() throws Throwable {
    // System.out.println("garbage");
   //     }
    System.out.println(one.age);// don't use only class name
    System.out.println(Student.age);//--> use this
}
  void greet(){//--> run only by object
        System.out.println("hi");
  }
  void fun(){
        greet();//-->greet() uses fun object to run 
  }
    
}
