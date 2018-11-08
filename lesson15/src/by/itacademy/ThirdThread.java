package by.itacademy;

public class ThirdThread extends Thread {
    Sync syncThird;

    ThirdThread(Sync syncc) {
        this.syncThird = syncc;

    }

    public void run() {
        syncThird.printSmth();
    }

}
