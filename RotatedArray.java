package Arrays;

public class RotatedArray {
    public static void main(String[] args) {
        
    
    int[] arr = {3,4,5,6,7,1,2};
        
        int result = BinarySearch(arr);
       System.out.println(result);
        
    }
    static int  BinarySearch(int[]arr){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            
            if(arr[start]>arr[mid]){
                end=mid;
            }else{
                start=mid;
            }
        }

        return mid;
    }
}

