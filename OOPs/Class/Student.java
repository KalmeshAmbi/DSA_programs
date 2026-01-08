package OOPs.Class;

 class Student {
    int r_no;
    String name;
  double perc;
  static int age ;
  // Student(){
	//   System.out.println("Hi! i Am inside");
	  
  // }
    Student (int r_no,String name,double perc){
    	this.r_no = r_no;
    	this.name = name;
    	this.perc = perc;
      Student.age=18;
     }
    Student(Student other){
    	this.r_no = other.r_no;
    	this.name = other.name;
    	this.perc = other.perc;
      Student.age=18;
    }
    Student(){
         this(13 , "kalmi",30.4);
    }
}
