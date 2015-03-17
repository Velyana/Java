/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequence;

import java.util.Random;

/**
 *
 * @author Velyana
 */
public class Sequence {

    private Object[] obs;
    private int next = 0;

    public Sequence(int size) {
        obs = new Object[size];
    }

    public void add(Object x) {
        if (next < obs.length) {
            obs[next] = x;
            next++;
        }
    }

    private class Sselector implements Selector {
// inner class манипулира преместване от първия към последния

        int i = 0;

        public boolean end() {
            return i == obs.length;
        }

        public Object current() {
            return obs[i];
        }

        public void next() {
            if (i < obs.length) {
                i++;
            }
        }

    } // end of inner class

    private class Rselector implements Selector {
// inner class манипулира преместване от последния към първия

        int i = obs.length - 1;

        @Override
        public boolean end() {
            return i == -1;
        }

        @Override
        public Object current() {
            return obs[i];
        }

        @Override
        public void next() {
            if (i >= 0) {
                i--;
            }
        }
    } // end of inner class

    public Selector getSelector() {
        return new Sselector();
    }

    public Selector getRSelector() {
        return new Rselector();
    }

    public static void main(String[] args) {
        Sequence s = new Sequence(8);
        Random r = new Random();
        for (int i = 0; i < 8; i++) {
            s.add(r.nextInt(100) + 10);
        }
        Selector sl = s.getSelector();
        Selector sr = s.getRSelector();

        while (!sl.end()) {
            System.out.printf("%d ", sl.current());
            sl.next();
        }
        System.out.println();
        while (!sr.end()) {
            System.out.printf("%d ", sr.current());
            sr.next();
        }
        System.out.println();
    }

}
