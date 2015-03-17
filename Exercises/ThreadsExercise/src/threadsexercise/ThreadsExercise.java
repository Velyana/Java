
package threadsexercise;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author Velyana
 */

public class ThreadsExercise {
    
       static void message(String m) {
        String name = Thread.currentThread().getName();
        System.out.format("%s, %s%n", name, m);
    }
    
    private static class Loop implements Runnable {

        public void run() {
            String info[] = {
                "a", "b", "c", "d"
            };
            try {
                for (int i = 0; i < info.length; i++) {
                    Thread.sleep(3000);
                    message(info[i]);
                }
            } catch (InterruptedException e) {
                message("no");
            }
            
        }
    }
    
    public static void main(String[] args) throws InstantiationException, InterruptedException{
        long patience = 1000*60*60;
        if(args.length > 0) {
            try {
                patience = Long.parseLong(args[0])*1000;
            } catch (NumberFormatException e) {
                System.out.println("Must be int");
                System.exit(1);
            }
        }
        message("starting messageLoop thred");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new Loop());
        t.start();
        
        message("waiting for messageLoop to finish");
        while(t.isAlive()) {
            message("Still waiting...");
            t.join(1000);
            if(((System.currentTimeMillis() - startTime) > patience) && t.isAlive()) {
                message("Tired of waiting!");
                t.interrupt();
                t.join();
            }
        }
        message("Finnaly!");
    }

}




/*
    static void message(String m) {
        String name = Thread.currentThread().getName();
        System.out.format("%s, %s%n", name, m);
    }
    
    private static class Loop implements Runnable {

        public void run() {
            String info[] = {
                "a", "b", "c", "d"
            };
            try {
                for (int i = 0; i < info.length; i++) {
                    Thread.sleep(3000);
                    message(info[i]);
                }
            } catch (InterruptedException e) {
                message("no");
            }
            
        }
    }
    
    public static void main(String[] args) throws InstantiationException, InterruptedException{
        long patience = 1000*60*60;
        if(args.length > 0) {
            try {
                patience = Long.parseLong(args[0])*1000;
            } catch (NumberFormatException e) {
                System.out.println("Must be int");
                System.exit(1);
            }
        }
        message("starting messageLoop thred");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new Loop());
        t.start();
        
        message("waiting for messageLoop to finish");
        while(t.isAlive()) {
            message("Still waiting...");
            t.join(1000);
            if(((System.currentTimeMillis() - startTime) > patience) && t.isAlive()) {
                message("Tired of waiting!");
                t.interrupt();
                t.join();
            }
        }
        message("Finnaly!");
    }
*/