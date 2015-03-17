/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

import java.util.ArrayList;

/**
 *
 * @author Velyana
 */
public class Test {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3, 6);
        Point p3 = new Point(8, 9);
        Line l1 = new Line();
        Line l2 = new Line(p1, p2);
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(p2, p3);

        ArrayList<Point> arrP = new ArrayList<>();
        ArrayList<Line> arrL = new ArrayList<>();
        ArrayList<Rectangle> arrR = new ArrayList<>();

        arrP.add(p1);
        arrP.add(p2);
        arrP.add(p3);

        arrL.add(l1);
        arrL.add(l2);

        arrR.add(r1);
        arrR.add(r2);

        for (int i = 0; i < arrP.size(); i++) {
            System.out.println(arrP.get(i).toString());
        }
        for (int i = 0; i < arrL.size(); i++) {
            System.out.println(arrL.get(i).toString());
        }
        for (int i = 0; i < arrR.size(); i++) {
            System.out.println(arrR.get(i).toString());
        }
    }
}
