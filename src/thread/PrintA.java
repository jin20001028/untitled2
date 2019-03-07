package thread;

public class PrintA implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; System.out.printf("%-3s", "A"), i++);
    }
}
