package OOPs.Class;

public class StaticInnerClass { //-->it cann't be static 
    static class InnerClass{ //-->it doesn't dependent on StaticInnerClass object
        String name;         //--> it can have objects
        public InnerClass(String name){
            this.name = name;
        }
    
    public static void main(String[] args) {
        InnerClass a = new InnerClass("kalmesh");
        InnerClass b = new InnerClass("ravi");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
}