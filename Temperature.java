import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the temperature of a Room: ");
        float tempC= input.nextInt();
        float tempF = (tempC*1.8f)+32;
        System.out.println("Temperature in Fahrenheit:"+tempF+"F");
    }

    
}
