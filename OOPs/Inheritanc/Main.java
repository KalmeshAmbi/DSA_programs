package OOPs.Inheritanc;

public class Main {
    public static void main(String[] args) {
        Box box= new Box(4);
        BoxWeight box1= new BoxWeight();
        System.out.println(box.l);
        System.out.println(box.h);
        System.out.println(box.w);
        System.out.println(box1.h); // --> accessing the parent property
       // System.out.println(BoxWeight.edgeNo); --> can not access edgeNo because it is private
       /* reference variable of type Box */Box box2  = new BoxWeight(2 ,3,4,8);/* object of type BoxWeight */
       // System.out.println(box2.weight); --> can not access because Box class don't has idea about BoxWeight
       Box box3 = new BoxPrice();// BOx--> BoxWeight --> BoxPrice
       BoxPrice box4 = new BoxPrice();
       System.out.println(box4.l);
    }
}
