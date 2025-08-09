public class LazyLoading {
    private static LazyLoading LAZY_LOADING;

    private LazyLoading() {}

    // 1. Ordinary (Not thread-safe)
    public static LazyLoading getInstance() {
        if (LAZY_LOADING == null) {
            LAZY_LOADING = new LazyLoading();
        }
        return LAZY_LOADING;
    }

    // 2. Synchronized method (thread-safe but slow)
    public static synchronized LazyLoading getSyncInstance() {
        if (LAZY_LOADING == null) {
            LAZY_LOADING = new LazyLoading();
        }
        return LAZY_LOADING;
    }

    // 3. Double-check locking (thread-safe & faster)
    public static LazyLoading getDoubleCheckInstance() {
        if (LAZY_LOADING == null) {
            synchronized (LazyLoading.class) {
                if (LAZY_LOADING == null) {
                    LAZY_LOADING = new LazyLoading();
                }
            }
        }
        return LAZY_LOADING;
    }

    // 4. Bill Pugh Singleton (Best option)
    private static class CREATE_INSTANCE {
        private static final LazyLoading lazyLoading = new LazyLoading();
    }

    public static LazyLoading getBillPughInstance() {
        return CREATE_INSTANCE.lazyLoading;
    }

    public void run(String singleton) {
        System.out.println("App is running (" + singleton + ") : " + LAZY_LOADING);
    }
}