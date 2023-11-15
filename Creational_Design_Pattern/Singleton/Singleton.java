package Creational_Design_Pattern.Singleton;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Singleton {
    private static Singleton db = null;
    private static Semaphore sp = new Semaphore(1);
    private Singleton(){
        System.out.println("Instance has created ");
    }

    static Singleton getInstance() throws InterruptedException {
        if(db == null){
            sp.acquire();
            if(db == null){
                db = new Singleton();
            }
            sp.release();
        }
        return db;
    }
}
