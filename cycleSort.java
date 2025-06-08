package Arrays;

import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
         int[] arr ={2,4,3,5,6,1};
         sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void sorting(int [] arr){
            int i = 0;
            while (i <arr.length) {
                int correct = arr[i] -1;
                if(arr[i]!=arr[correct]){
                    swap(arr,i,correct);

                }else{
                    i++;
                }
                
            }
        
        }
    static void swap(int []arr, int first ,int second){
        int temp =arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

               

    
}
