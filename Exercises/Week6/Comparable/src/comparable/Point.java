/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparable;

/**
 *
 * @author Velyana
 */
public class Point implements Comparable {

    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public Point(Point p) {
        this(p.getX(), p.getY());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = (x > 0 ? x : 0);
    }

    public void setY(int y) {
        this.y = (y > 0 ? y : 0);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }

    @Override
    public boolean greater(Comparable obj) {
        if (obj instanceof Point) {
            Point p = (Point) obj;
            if (x > p.getX() && y > p.getY()) {
                return true;
            }
        }
        return false;
    }
}
