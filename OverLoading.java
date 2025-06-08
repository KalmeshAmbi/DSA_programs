public class OverLoading {
    public static void main(String[] args) {
        function(67);
        function("kalmesh");

    }
    static void function(int a){
        System.out.println(a);
    }
    static void function(String name){
        System.out.println(name);
    }

}
