import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean ans = isPrime(a);
        System.out.println(ans);
    }
  static boolean isPrime(int n){
    if (n==1){

      return false;

    }
     int c=2;
     while(c*c<=n){
        if(n%c==0){
            return false;
        }
        c++;

     }
         return c*c>n;
    }
}
