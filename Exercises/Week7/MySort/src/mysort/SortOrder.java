/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysort;

/**
 *
 * @author Velyana
 */
public class SortOrder {

    private class Upward implements Sortable {

        public boolean greater(int a, int b) {
            return a > b;
        }
    }

    private class Downward implements Sortable {

        public boolean greater(int a, int b) {
            return a < b;
        }
    }

    public Upward up() {
        return new Upward();
    }

    public Downward down() {
        return new Downward();
    }

//    public Sortable getUpward() {
//        return new Upward();
//    }
//
//    public Sortable getDownward() {
//        return new Downward();
//    }
}
