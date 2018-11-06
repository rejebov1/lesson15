package by.itacademy;

public class SecondThread extends Thread {
    SyncSmth syncSecond;

    SecondThread(SyncSmth syncSmthMore) {
        this.syncSecond = syncSmthMore;
    }

    public void run() {
        syncSecond.printSmth();
    }
}

