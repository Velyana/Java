/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

/**
 *
 * @author Velyana
 */
public class CompositionTest {

    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {3, 6};
        int[] c = {5, 8};

        Point p1 = new Point();
        Point p2 = new Point(b);
        Point p3 = new Point(c);

        Point[] pp1 = {p2, p3};
        Point[] pp2 = {p1, p2};

        Rectangle r1 = new Rectangle(pp1);
        Rectangle r2 = new Rectangle();

        Line l1 = new Line(p2, p3);
        Line l2 = new Line();

//        System.out.println(p1.toString());
//        p1.setPoint(b);
//        System.out.println(p1.toString());
//        System.out.println(p2.toString());
//        System.out.println(r1.toString());
//        r1.setRec(pp2);
//        System.out.println(r1.toString());
//        System.out.println(r2.toString());
        System.out.println(l1.toString());
        l1.setePoint(p1);
        System.out.println(l1.toString());
        System.out.println(l2.toString());

    }
}
