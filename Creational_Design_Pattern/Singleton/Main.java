package Creational_Design_Pattern.Singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService esc = Executors.newCachedThreadPool();
        for(int i = 0; i<10; i++){
            Thread t = new Thread(new Helper());
            esc.submit(t);
        }

    }
}
