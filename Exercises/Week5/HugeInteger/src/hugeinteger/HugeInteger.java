/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hugeinteger;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Velyana
 */
public class HugeInteger {
    
    private int[] array = new int[40];
    
    public HugeInteger() {
        array = new int[array.length];
        Arrays.fill(array, 0);
    }
    
    public HugeInteger(int[] arr) {
        setArray(arr);
    }
    
    public HugeInteger(HugeInteger h) {
        this(h.getArray());
    }
    
    public int[] getArray() {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
    
    public void setArray(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }
    }
    
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result = result + array[i] + " ";
        }
        return result;
    }
    
    public void inputArr() {
        System.out.println("Input digits of the number(max 40): ");
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
    }
    
    public HugeInteger add(HugeInteger arr) {
        HugeInteger result = new HugeInteger();
        int[] tempRes = new int[array.length];
        String[] temp = arr.toString().split(" ");
        int[] tempArr = new int[temp.length];
        
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = Integer.parseInt(temp[i]);
        }
        for (int i = 0; i < array.length; i++) {
            tempRes[i] = tempArr[i] + array[i];
        }
        result = new HugeInteger(tempRes);
        return result;
    }
    
    public HugeInteger subtraction(HugeInteger arr) {
        HugeInteger result = new HugeInteger();
        int[] tempRes = new int[array.length];
        String[] temp = arr.toString().split(" ");
        int[] tempArr = new int[temp.length];
        
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = Integer.parseInt(temp[i]);
        }
        for (int i = 0; i < array.length; i++) {
            tempRes[i] = array[i] - tempArr[i];
        }
        result = new HugeInteger(tempRes);
        return result;
    }
    
    public boolean isEqualTo(HugeInteger arr) {
        String firstArr = "";
        for (int i = 0; i < array.length; i++) {
            firstArr = firstArr + array[i] + " ";
        }
        return firstArr.equals(arr.toString());
    }
    
    public boolean isNotEqualTo(HugeInteger arr) {
        return !(isEqualTo(arr));
    }
    
    public boolean isGreaterThan(HugeInteger arr) {
        boolean result = false;
        int[] temp = arr.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > temp[i]) {
                result = true;
                break;
            }
        }
        return result;
    }
    
    public boolean isLessThan(HugeInteger arr) {
        boolean result = false;
        int[] temp = arr.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < temp[i]) {
                result = true;
                break;
            }
        }
        return result;
    }
    
    public boolean isLessThanOrEqualTo(HugeInteger arr) {
        return !(isGreaterThan(arr));
    }
    
    public boolean isGreaterThanOrEqualTo(HugeInteger arr) {
        return !(isLessThan(arr));
    }
    
    public boolean isZero() {
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                result = false;
                break;
            }
            
        }
        return result;
    }
    
}
