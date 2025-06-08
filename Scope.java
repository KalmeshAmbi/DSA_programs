import java.util.Scanner;
public class Scope {
static float pi=3.14f;
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the radius of a circle:");
      int radius = in.nextInt();
      System.out.println("the area of a circle:"+area(radius));
      System.out.println("the perimeter of a circe is:"+perimeter( radius));
    }
    static float area(float rad){
       
        return pi*rad*rad;
    }
    static float perimeter(float rad){
       
      return pi*rad*2;
  }
}
