package gr.aueb.cf.ch14;

public class PointMain {

    public static void main(String[] args) {

//        Point point = new Point();
//        Point2D point2D = new Point2D();
//        Point3D point3D = new Point3D();

        Point p1 = new Point();
        Point p2 = new Point2D(); //στο stack ειναι Point, στο heap ειναι Point2D
        Point p3 = new Point3D();

        doPrint(p1);
        doPrint(p2);
        doPrint(p3);

        p2.movePlusOne(); //θα κλειθεί το movePlusOne() της p2
        p2.movePlus10();

        p3.movePlus10();

        ((Point2D) p2).setY(15); //επειδή η setY ανήκει στην Point δεν μπορουμε να την καλέσουμε ως p2.setY(15) - κανουμε typecast το p2 σε Point2D γιατι ήταν τύπου Point

        //at runtime ποιο instance περνάμε ως πραγματικη παράμετρος αποφασίζεται δεν δουλευει ο πολυμορφισμός με static μεθόδους
//        doMovePlus10(point);
//        doMovePlus10(point2D);
//        doMovePlus10(point3D);
    }



    public static void doMovePlus10 (Point point) {
        point.movePlusOne(); //για να δουλέψει ο πολυμορφισμός θα πρέπει να γίνει overwrite
    }


    public static void doPrint(Point point) {
        System.out.println(point.toString());
    }
}
