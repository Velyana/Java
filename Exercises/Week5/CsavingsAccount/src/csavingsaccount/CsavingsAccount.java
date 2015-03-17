/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csavingsaccount;

import java.util.Random;

/**
 *
 * @author Velyana
 */
public class CsavingsAccount {

    private static double mAnnualInterestRate = 1.2;
    private double mSavingsBalance;
    private int mNumber;
    private static int count = 0;

    public int generateNumber() {
        Random rand = new Random();
        int randNum = rand.nextInt(100);
        return randNum;
    }

    public CsavingsAccount() {
        this(0.0, 0);
    }

    public CsavingsAccount(double mSavingsBalance, int mNumber) {
        setmSavingsBalance(mSavingsBalance);
        setmNumber(mNumber);
        count++;
        System.out.printf("CsavingsAccount constructor: count = %d\n", count);
    }

    public CsavingsAccount(CsavingsAccount c) {
        this(c.getmSavingsBalance(), c.getmNumber());
    }

    protected void finalize() {
        count--;
        System.out.printf("CsavingsAccount finalizer: count = %d\n", count);
    }

    public double getmAnnualInterestRate() {
        return CsavingsAccount.mAnnualInterestRate;
    }

    public double getmSavingsBalance() {
        return mSavingsBalance;
    }

    public int getmNumber() {
        return mNumber;
    }

    public void setmAnnualInterestRate(double rate) {
        CsavingsAccount.mAnnualInterestRate = rate;
    }
    
    public void setmSavingsBalance(double mSavingsBalance) {
        this.mSavingsBalance = mSavingsBalance;
    }

    public void setmNumber(int mNumber) {
        this.mNumber = generateNumber();
    }

    @Override
    public String toString() {
        return String.format("mAnnualInterestRate = %f, mSavingsBalance = %f", mAnnualInterestRate, mSavingsBalance);
    }

    public void calculateMonthlyInterest() {
        mSavingsBalance += (mAnnualInterestRate * mSavingsBalance) / 12;
    }

//    public static void modifyInterestRate() {
//
//    }

    public boolean isGreater(CsavingsAccount acc) {
        return mSavingsBalance > acc.getmSavingsBalance();
    }

    public static int getCount() {
        return count;
    }
}
