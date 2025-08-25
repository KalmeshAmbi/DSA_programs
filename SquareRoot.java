public class SquareRoot {

    public static void main(String[] args) {
        int precision = 5;
        int num = 10001;
        System.out.printf("%.5f",squrRoot(num , precision));
    }
    static double squrRoot(int num , int precision){
        double root =0;
 
       double increment = 1;
        for(int i =0 ; i<= precision ;i++){
            
         while(root * root <= num){
            if(root * root == num){
                return root;
            }
                root +=increment;
         }
          root -=increment;
         increment =increment / 10;
        }
        return root;
    }
}