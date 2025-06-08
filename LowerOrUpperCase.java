import java.util.Scanner;
public class LowerOrUpperCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Alphabeta:");
        char ch = input.next().trim().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Given alphabeta '"+ch+"' is in lowercase");

        }else{
            System.out.println("Given alphabeta '"+ch+"' is in uppercase");

        }

    }
    
}
