package OOPs.Inheritanc;

public class Box {
    double l;
    double h;
    double w;
private int edgeNo =8;
    Box(){
       
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    // cube
    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }
    Box(double l,double w,double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
    public void newBox(){
System.out.println("new box");
    }
}



