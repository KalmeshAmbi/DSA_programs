package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3, 4,5, 6,7};
        int target = 6;
        int result = BinarySearch(arr1, target);
        System.out.println(result);
        
    }
    static int  BinarySearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return -1;
    }
    
}
