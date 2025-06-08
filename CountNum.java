import java.util.Scanner;
public class CountNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number:");
        int n=input.nextInt();
        int count = 0;
        while(n>0){
            int rem = n % 10 ;
            if(rem==5){
                count++;
            
            }
            n = n/10;
        }
        System.out.println("the count 5 in a number is:"+count);
    }
    
}
