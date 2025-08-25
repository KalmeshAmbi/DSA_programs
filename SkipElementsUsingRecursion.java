public class SkipElementsUsingRecursion {
    public static void main(String[] args) {
        skip("", "abcdabcd");
        System.out.println(skip("aaaaaaaabaaacddaba"));// out from return type string
    }
    //the return type is void
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p , up.substring(1));
        }else{
           skip(p + ch , up.substring(1)); 
        }
    }
// in this skip function the return type is string
    static String skip(String up){
        if(up.isEmpty()){
            return"";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
          return  skip( up.substring(1));
        }else{
          return ch + skip( up.substring(1)); 
        }
    }
}
