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
public class Line {

    private Point sPoint, ePoint;

    public Line() {
        this(new Point(), new Point());
    }

    public Line(Point sPoint, Point ePoint) {
        setsPoint(sPoint);
        setePoint(ePoint);
    }

    public Line(Line l) {
        this(l.getsPoint(), l.getePoint());
    }

    public Point getsPoint() {
        return new Point(sPoint);
    }

    public Point getePoint() {
        return new Point(ePoint);
    }

    public void setsPoint(Point p) {
        if (p == null) {
            p = new Point();
        } else {
            sPoint = new Point(p);
        }
    }

    public void setePoint(Point p) {
        if (p == null) {
            p = new Point();
        } else {
            ePoint = new Point(p);
        }
    }

    @Override
    public String toString() {
        return "Line{" + "sPoint = " + sPoint.toString() + ", ePoint = " + ePoint.toString() + '}';
    }

}
