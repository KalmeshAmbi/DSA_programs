public class StringReturn {
public static void main(String[] args) {
    String personalised=greeting("kalmesh");
    System.out.println(personalised);
}
    static String greeting(String name){
      String message = "Hello! \t"+name;
      return message; 
    }
}