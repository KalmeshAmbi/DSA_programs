package Arrays;

public class nextGreatestToTarget {
    public static void main(String[] args) {
        char[] letters ={'a','b','c'};
        char target='c';
        char nextGreatestLetter=nextGreatest(letters,target);
        System.out.println(nextGreatestLetter);
    }
    static char nextGreatest(char[] letters,char target){
        int start=0;
        int end=letters.length-1;
        while (start<=end) {
           int mid=start+(end-start)/2;
           if(target>=letters[mid]){
            start=mid+1;
        }else{
            end=mid-1;
        }
            
        }
            return letters[start%letters.length ];
        
    }
}
