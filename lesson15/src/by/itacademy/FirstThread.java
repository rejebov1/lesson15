package by.itacademy;

public class FirstThread extends Thread {

    SyncSmth syncFirst;

    FirstThread(SyncSmth syncMore) {
        this.syncFirst = syncMore;
    }
    public void run() {
        syncFirst.printSmth();
    }
}
