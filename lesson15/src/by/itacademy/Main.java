package by.itacademy;

public class Main {
    public static void main(String args[]) {
        SyncSmth syncSmth = new SyncSmth();
        FirstThread firstThread = new FirstThread(syncSmth);
        firstThread.start();
        SecondThread secondThread = new SecondThread(syncSmth);
        secondThread.start();
    }
}

