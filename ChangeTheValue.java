import java.util.Arrays;

public class ChangeTheValue {
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,56,7};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){
        arr[4] = 5;
        arr[5] = 6;
    }
    
}
