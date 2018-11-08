package by.itacademy;

public class SecondThread extends Thread {
    Sync syncSecond;

    SecondThread(Sync syncSmthMore) {
        this.syncSecond = syncSmthMore;
    }

    public void run() {
        syncSecond.printSmth();
    }
}

