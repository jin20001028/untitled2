package thread;

public class PrintNum implements Runnable {
    @Override
    public void run() {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.printf("%-3s", "Z");
            }
        });
        thread.start();
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.printf("%-3s", "Num");

        }

//        for (int i = 0; i < 5; System.out.printf("%-3d", "Num"), i++);
    }
}

