package by.itacademy;

public class FirstThread extends Thread {

    Sync syncFirst;

    FirstThread(Sync syncMore) {
        this.syncFirst = syncMore;
    }
    public void run() {
        syncFirst.printSmth();
    }
}
