/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparable;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Velyana
 */
public class BubbleSortTest {

    public static void main(String[] args) {

        Random r = new Random();
        //!!! [10,50] - r.nextInt(41) + 10;
//        ArrayList<Point> arrP = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            arrP.add(new Point(r.nextInt(50) + 10, r.nextInt(50) + 10));
//        }
//        ArrayList<Circle> arrC = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            arrC.add(new Circle(r.nextInt(30) + 10, new Point(r.nextInt(50) + 10, r.nextInt(50) + 10)));
//        }
//        ArrayList<Cylinder> arrCyl = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            arrCyl.add(new Cylinder(r.nextInt(60) + 10, new Circle(r.nextInt(30) + 10, new Point(r.nextInt(50) + 10, r.nextInt(50) + 10))));
//        }
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(arrP.get(i).toString());
//        }
//        for (int i = 0; i < 3; i++) {
//            System.out.println(arrC.get(i).toString());
//        }
//        for (int i = 0; i < 3; i++) {
//            System.out.println(arrCyl.get(i).toString());
//        }

        BubbleSort b = new BubbleSort();
        Comparable[] arrComparable = new Comparable[3];

//        arrComparable[0] = new Point(r.nextInt(50) + 10, r.nextInt(50) + 10);
//        arrComparable[1] = new Point(r.nextInt(50) + 10, r.nextInt(50) + 10);
//        arrComparable[2] = new Point(r.nextInt(50) + 10, r.nextInt(50) + 10);
//        
//        arrComparable[0] = new Circle(r.nextInt(30) + 10, new Point(r.nextInt(50) + 10, r.nextInt(50) + 10));
//        arrComparable[1] = new Circle(r.nextInt(30) + 10, new Point(r.nextInt(50) + 10, r.nextInt(50) + 10));
//        arrComparable[2] = new Circle(r.nextInt(30) + 10, new Point(r.nextInt(50) + 10, r.nextInt(50) + 10));
//        
        arrComparable[0] = new Cylinder(r.nextInt(60) + 10, new Circle(r.nextInt(30) + 10, new Point(r.nextInt(50) + 10, r.nextInt(50) + 10)));
        arrComparable[1] = new Cylinder(r.nextInt(60) + 10, new Circle(r.nextInt(30) + 10, new Point(r.nextInt(50) + 10, r.nextInt(50) + 10)));
        arrComparable[2] = new Cylinder(r.nextInt(60) + 10, new Circle(r.nextInt(30) + 10, new Point(r.nextInt(50) + 10, r.nextInt(50) + 10)));

        for (Comparable i : arrComparable) {
            System.out.println(i.toString());
        }
        System.out.println();
        b.sortArray(arrComparable);
    }
}
