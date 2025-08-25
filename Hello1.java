public class Hello1 {
    static float pi = 10;
    public static void main(String[] args) {
         if( pi == 10){
            pi = 3;
         }
         System.out.println(pi);
         Cow c1 = new Cow();
            c1.sound();
    }
}
abstract class Animal{
     void sound(){
        System.out.println("Animal makes sound");
    }
}
class Cow extends Animal{
    void eat (){
        System.out.println("Cow eats grass");
    }
}
 interface Body {
void legs();
 void  eye();  
}
class Dog implements Body {
    public void legs() {
        System.out.println("Dog has 4 legs");
    }
    
    public void eye() {
        System.out.println("Dog has 2 eyes");
    }
}