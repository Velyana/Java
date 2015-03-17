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
public class Circle extends Point implements Comparable {

    private int radius;
    private Point p;

    public Circle() {
        super();
        radius = 0;
    }

    public Circle(int radius, Point pp) {
        super(pp);
        this.radius = radius;
    }

    //???
    public Circle(Circle c) {
        super(c);
        radius = c.getRadius();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Radius: %d, Center: %s", radius, super.toString());
    }

    @Override
    public boolean greater(Comparable obj) {
        if (obj instanceof Circle) {
            Circle c = (Circle) obj;
            if (p != null) {
                if (radius > c.getRadius() && p.greater(obj)) {
                    return true;
                }
            }
        }
        return false;
    }
}
