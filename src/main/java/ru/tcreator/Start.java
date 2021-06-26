package ru.tcreator;
public class Start {
    public static void main(String[] args) throws InterruptedException {
        final int STOP = 15000;
        ThreadGroup myThreadGroup = new ThreadGroup("test");
        new Thread(myThreadGroup, new NewThread()).start();
        new Thread(myThreadGroup, new NewThread()).start();
        new Thread(myThreadGroup, new NewThread()).start();
        new Thread(myThreadGroup, new NewThread()).start();

        try {
            Thread.sleep(STOP);
            myThreadGroup.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
