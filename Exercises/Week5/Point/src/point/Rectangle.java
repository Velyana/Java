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
public class Rectangle {

    private Point uPoint, lPoint;
    private Point[] rec = new Point[]{uPoint, lPoint};

    public Rectangle() {
        this(new Point[]{new Point(), new Point()});
    }

    public Rectangle(Point[] p) {
        setRec(p);
    }

    public Rectangle(Rectangle r) {
        this(r.getRec());
    }

    public Point[] getRec() {
        Point[] result = new Point[rec.length];
        for (int i = 0; i < rec.length; i++) {
            result[i] = new Point(rec[i]);
        }
        return result;
    }

    public void setRec(Point[] p) {
        if (p == null) {
            p = new Point[]{new Point()};
        } else {
            rec = new Point[p.length];
            for (int i = 0; i < p.length; i++) {
                rec[i] = new Point(p[i]);
            }
        }
    }

    @Override
    public String toString() {
        String result = "Rectangle{";
        for (int i = 0; i < rec.length; i++) {
            result += rec[i].toString() + " ";
        }
        return result + '}';
    }

}
