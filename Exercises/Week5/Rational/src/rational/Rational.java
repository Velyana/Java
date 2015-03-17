/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rational;

/**
 *
 * @author Velyana
 */
public class Rational {

    private int num;
    private int den;

    public Rational() {
        this(1, 1);
    }

    public Rational(int num, int den) {
        int temp = gcd(num, den);
        if (den < 0) {
            setNum(-num / temp);
            setDen(-den / temp);
        } else {
            setNum(num / temp);
            setDen(den / temp);
        }

    }

    public Rational(Rational r) {
        this(r.getNum(), r.getDen());
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDen(int den) {
        this.den = den;
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }

    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a > 0 ? a : b;
    }

    public Rational toNormal() {
        if (den < 0) {
            return new Rational(-num, -den);

        }
        int temp = gcd(num, den);
        return new Rational(num / temp, den / temp);
    }

    public Rational add(Rational r) {
        return new Rational((num * r.den + r.num * den), den * r.den).toNormal();
    }

    public Rational subtraction(Rational r) {
        return new Rational((num * r.den - r.num * den), den * r.den).toNormal();
    }

    public Rational multiplication(Rational r) {
        return new Rational(num * r.num, den * r.den).toNormal();
    }

    public Rational division(Rational r) {
        return new Rational(num * r.den, r.num * den).toNormal();
    }

}
