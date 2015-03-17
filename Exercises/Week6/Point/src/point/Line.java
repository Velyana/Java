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
public class Line extends Point {

    private Point end;

    public Line() {
        super();
        end = new Point();
    }

    public Line(Point pStart, Point pEnd) {
        super(pStart);
        end = new Point(pEnd);
    }

//    public Line(int xS, int yS, int xE, int yE) {
//        super(xS, yS);
//        end = new Point(xE, yE);
//    }
    
    public Line(Line l) {
        super(l);
        setP(l.getP());
    }

    public Point getP() {
        return new Point(end);
    }

    public void setP(Point p) {
        this.end = new Point(p);
    }

    @Override
    public String toString() {
        return String.format("Start: %s, End: %s", super.toString(), end);
    }

}
