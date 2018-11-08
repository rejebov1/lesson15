package by.itacademy;

public class Sync {

   synchronized void printSmth() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+ " " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
