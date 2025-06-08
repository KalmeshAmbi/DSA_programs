import java.util.Scanner;
public class Switch{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a fruit name");
        String fruit = input.next();
        switch (fruit) {
            case "Mango":
                System.out.println("King of all fruits");
                 break;
            case "Apple":
                 System.out.println("Sweet fruit");
                  break; 
            case "Pinapple":
                  System.out.println(" Fruit from Megalaya");
                   break; 
            case "Watermelon":
                   System.out.println("Fruit of Summer");
                    break;
            default: System.out.println("Invalid Fruit");
                break;
        }
    }
    
}
