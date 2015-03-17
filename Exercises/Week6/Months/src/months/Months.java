/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package months;

/**
 *
 * @author Velyana
 */
public enum Months {

    JAN, FEB, MAR, APR,
    MAY, JUN, JUL, AUG,
    SEP, OCT, NOV, DEC;

    protected static String[] month = {"January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"};

    @Override
    public String toString() {

        switch (this) {
            case JAN:
                return "January";
            case FEB:
                return "February";
            case MAR:
                return "March";
            case APR:
                return "April";
            case MAY:
                return "May";
            case JUN:
                return "June";
            case JUL:
                return "July";
            case AUG:
                return "August";
            case SEP:
                return "September";
            case OCT:
                return "October";
            case NOV:
                return "November";
            case DEC:
                return "December";
            default:
                throw new IllegalArgumentException();
        }
    }

}
