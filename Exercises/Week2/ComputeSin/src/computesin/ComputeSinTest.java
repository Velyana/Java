/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computesin;

/**
 *
 * @author Velyana
 */
public class ComputeSinTest {
    public static void main(String[] args) {
        double step = 0.0;
        ComputeSin compute = new ComputeSin();
        while(step < 3.14/2) {
            compute.setX(step);
            System.out.printf("%10.3f\n", compute.computeSin());
            step += 0.1;
        }
    }
}
