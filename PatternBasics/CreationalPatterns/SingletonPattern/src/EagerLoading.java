public class EagerLoading {
    private final static EagerLoading EAGER_LOADING = new EagerLoading();
    private EagerLoading(){
    }

    public static EagerLoading getInstance(){
        return EAGER_LOADING;
    }

    public static void run(){
        System.out.println("App is running instance "  + EAGER_LOADING);
    }
}


