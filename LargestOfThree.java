import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
       /*  largest of three number using logica operator
       if(a>b && a>c){
            System.out.println("The largest number is:"+a);
        }else if(b>a && b>c){
            System.out.println("The largest number is:"+b);
        }else{
            System.out.println("The largest number is:"+c);
        }
            */
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("The largest number is:"+max);
    }
    
}
