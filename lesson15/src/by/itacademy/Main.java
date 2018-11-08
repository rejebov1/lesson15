package by.itacademy;

public class Main {
    public static void main(String args[]) {
        Sync syncSmth = new Sync();
        FirstThread firstThread = new FirstThread(syncSmth);
        firstThread.start();
        SecondThread secondThread = new SecondThread(syncSmth);
        secondThread.start();
        ThirdThread thirdThread = new ThirdThread(syncSmth);
        thirdThread.start();
    }
}

