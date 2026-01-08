package OOPs.Polymorphism;

public class Circle extends Shape{
	int num;
	 Circle(int num) {
		this.num = num;
	}
	@Override
	public String toString(){
		return "{"+num+"}";
	}
	@Override
    void area(){//--> late binding
        System.out.println("Area of Circle 2 * PI * r");
    }
}
