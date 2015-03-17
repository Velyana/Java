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
public class Cylinder extends Circle implements Comparable {

    private int height;
    private Circle c;

    public Cylinder() {
        super();
        height = 0;
    }

    public Cylinder(int height, Circle c) {
        super(c);
        this.height = height;
    }

    public Cylinder(Cylinder cyl) {
        super(cyl);
        height = cyl.getHeight();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Circle: %s, Height: %d", super.toString(), height);
    }

    @Override
    public boolean greater(Comparable obj) {
        if (obj instanceof Cylinder) {
            Cylinder cyl = (Cylinder) obj;
            if (c != null) {
                if (height > cyl.getHeight() && c.greater(obj)) {
                    return true;
                }
            }
        }
        return false;
    }
}
