public class Patterns{
    public static void main(String[]args){
          pattern6(7);

    }
    static void pattern1(int n){
        for(int row = 0; row < n; row++){
            for(int col = 0; col<=row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row = 0; row < n; row++){
            for(int col = 0; col< n- row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
static void pattern3(int n){
        for(int row = 0; row < n; row++){
            for(int col = 0; col< n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row = 1; row <=n; row++){
            for(int col = 1; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
     static void pattern5(int n){
        for(int row = 0; row <=n; row++){
            for(int col = 1; col<=n -row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int i = 0 ; i <= n ; i++){
                  for(int j = 0 ; j <=i  ; j++){
               System.out.print(" ");
            
        }
               for(int j = 1 ; j <=n -i ; j++){
               System.out.print(j+" ");
            
        }
        System.out.println();
        }
    }
    public static void main(int[] args) {
        
    }
}
