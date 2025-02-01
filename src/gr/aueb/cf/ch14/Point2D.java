package gr.aueb.cf.ch14;

public class Point2D extends Point{
    private double y;

    public Point2D() {
        //super(); // Ως πρώτη εντολή πρέπει να καλεί τον default constructor της Point(super class), το οποίο ούτως η άλλως γίνεται
        // y = 0;
    }

    public Point2D(double x, double y) {
        //super(x); //καλεί τον υπερφορτωμένο constructor της point, αυτο όμως δεν γίνεται αυτόματα όπως ο default
        setX(x); //αλλιως καλείται έτσι, καλόντας τον setter
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


//    @Override
//    public String pointToString() {
//        return super.pointToString() + "(" + y + ")";
//    }


    @Override
    public String toString() {
        return super.toString() + "(" + y + ")";
    }

    // Liskov substitution principle
    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10 ;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }
}
