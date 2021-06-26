package ru.tcreator;

public class NewThread extends Thread{

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Всем привет! Я " + getName());
            }
        } catch (InterruptedException err) {

        } finally{
            System.out.printf("%s завершен\n", getName());
        }
    }
}
