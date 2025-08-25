import java.util.ArrayList;
public class LinearSearchWithRecursion {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,8,8,6,7};
        //System.out.println(linearSearch(arr, 1, 0));
        System.out.println(linearSearch(arr, 8, 0,new ArrayList<>()));
    }
   
    //static ArrayList<Integer> list = new ArrayList<>(); -->initiaizing the arrayList
    static ArrayList linearSearch(int [] arr, int target,int index,ArrayList<Integer> list){
       if (index==arr.length) {
        return list;
       } 
        if (arr[index] == target) {
            list.add(index);
        }
        return linearSearch(arr, target,index+1,list);
    }
    static int linearSearch(int[] arr,int target , int index){
        if(index == arr.length){
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return linearSearch(arr, target, index+1);
    }
}
