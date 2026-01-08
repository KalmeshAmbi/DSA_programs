package OOPs.Inheritanc;

public class BoxWeight extends Box {
    double weight;
    BoxWeight(){
        this.weight = -1;
    }
    BoxWeight(double l,double w,double h,double weight){
        super(l, w, h);
        this.weight = weight;
    }
    BoxWeight(BoxWeight other){
        super(other);//--> initializing or calling parent property through Super() keyword and super keyword exactly point to it's above class
        weight = other.weight;
    }
}
