import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=input.nextInt();
        int rev_num=0;
        while (num>0) {
            int rem = num%10;
            num=num/10;
            
            rev_num=rev_num*10+rem;
            
        }
        System.out.print("Reversed number is:"+rev_num);
    }
    
}
