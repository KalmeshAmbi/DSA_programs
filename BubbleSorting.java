package Arrays;
import java.util.Arrays;
public class BubbleSorting {
    
    public static void main(String[] args) {
        int[] arr ={2,4,3,5,6,1};
        System.out.println(Arrays.toString(sorting(arr)));
        
    }
    static int[] sorting(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                int temp;
                if(arr[j] < arr[j-1]){

                    temp = arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1] = temp;
                }
            
            }
          
        }
                return arr;
    }
}
