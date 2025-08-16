public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            Logger logger = Logger.getInstance();
            System.out.println(Thread.currentThread().getName() +
                    " got instance: " + System.identityHashCode(logger));
            logger.logInfo("Logging from thread " + Thread.currentThread().getName());
        };

        for (int i = 0; i < 5; i++) {
            new Thread(task, "T" + i).start();
        }

    }
}