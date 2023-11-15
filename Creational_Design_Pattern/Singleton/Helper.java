package Creational_Design_Pattern.Singleton;

public class Helper implements Runnable{
    public void run(){
        try {
            Singleton.getInstance();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
