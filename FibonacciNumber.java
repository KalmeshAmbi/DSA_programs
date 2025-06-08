import java.util.Scanner;
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=input.nextInt();
        System.out.print("Fibonacci Series is:");
        
            int a=0;
            int b=1;
        for(int i=0;i<n-1;i++){
            if(i==0){
            System.out.print("0\t");
        }
        if(i==1){
            System.out.print("1\t");
        }
        int fib=a+b;
        System.out.print(fib+"\t");
        a=b;
        b=fib;
        }
    }
}
