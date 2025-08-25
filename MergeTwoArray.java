
import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 ={1,2,4,5,6};
        int[] arr2 ={2,3,5,7,8,9};
        System.out.println(Arrays.toString(Merge(arr1,arr2)));
        
    }
    static int [] Merge(int []arr1,int [] arr2){
        int [] mergedArray= new int[arr1.length+arr2.length-1];
        int indexArray1=0;
        int indexArray2=0;
        for(int i=0 ; i < mergedArray.length ; i++){
             if(arr1[indexArray1]<=arr2[indexArray2] && indexArray1 < arr1.length){
                mergedArray[i]=arr1[indexArray1];
                indexArray1 ++;
             }if(arr1[indexArray1]>arr2[indexArray2] && indexArray2 < arr2.length){
                mergedArray[i]=arr2[indexArray2];
                indexArray2 ++;

             }

        }
        return mergedArray;
    }
    
}
