package OOPs.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle= new Circle(5);
        Triangle triangle = new Triangle(); 
        Square square = new Square();
        Pentagon pentagon = new Pentagon();
        
//        shape.area();
//        circle.area();
//        triangle.area();
//        square.area();
//        pentagon.area();
//        
        System.out.println(circle);
    }
    
}
