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
public class Rectangle extends Point {

    private Point p;

    public Rectangle() {
        super();
        p = new Point();
    }

    public Rectangle(Point pStart, Point pEnd) {
        super(pStart);
        p = new Point(pEnd);
    }

    public Rectangle(Rectangle r) {
        super(r);
        setP(r.getP());
    }

    public Point getP() {
        return new Point(p);
    }

    public void setP(Point p) {
        this.p = new Point(p);
    }

    @Override
    public String toString() {
        return String.format("Start point: %s, End point: %s", super.toString(), p);
    }

}
