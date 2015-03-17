/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author Velyana
 */
public class Rectangle {

    /**
     * @param args the command line arguments
     */
    private double width;
    private double height;
    private static String color;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
        Rectangle.color = "yellow";
    }

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public static String getColor() {
        return color;
    }

    public void setWidth(double width) {
        if (width >= 0) {
            this.width = width;
        } else {
            this.width = 0;
        }
    }

    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public static void setColor(String color) {
        if (color != null) {
            Rectangle.color = color;
        } else {
            Rectangle.color = "";
        }
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
