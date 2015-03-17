/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

/**
 *
 * @author Velyana
 */
public class ComputerTest {

    public static void main(String[] args) {
        String[] s1 = {"a1", "a2", "a3"};
        String[] s2 = {"v1"};
        Computer c1 = new Computer();
        Computer c2 = new Computer("Teo", 12, s1);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        c2.setType("Velyana");
        c2.setProcSpeed(20);
        c2.setFiles(s2);
        System.out.println(c2.toString());
    }
}
