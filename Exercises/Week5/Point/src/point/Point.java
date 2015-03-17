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
public class Point {

    private int x, y;
    private int[] point = new int[]{x, y};

    public Point() {
        this(new int[]{0, 0});
        //this((int)null); ?
    }

    public Point(int[] arr) {
        setPoint(arr);
    }

    public Point(Point p) {
        this(p.getPoint());
        //this(p==null ? new int : p.point);
    }

    public int[] getPoint() {
        int[] result = new int[point.length];
        for (int i = 0; i < point.length; i++) {
            result[i] = point[i];
        }
        return result;
    }

    public void setPoint(int[] arr) {
        if (arr == null) {
            point = new int[]{0, 0};
        } else {
            point = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                point[i] = arr[i];
            }
        }
    }

    @Override
    public String toString() {
        // return "Point(" + point[0] + ", " + point[1] + ')';
        return String.format("Point(%d, %d)", point[0], point[1]);
    }

}

  //get; set - kopie
