package Arrays;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr ={2,4,3,5,6,1};
        System.out.println(Arrays.toString(insertion(arr)));
        
    }
    static int[] insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                int temp;
                if(arr[j] < arr[j-1]){

                    temp = arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            
            }
          
        }
                return arr;
    }
    
}
