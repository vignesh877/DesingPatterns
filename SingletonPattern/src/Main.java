public class Main {
    public static void main(String[] args) {

        EagerLoading eagerLoading = EagerLoading.getInstance();
        eagerLoading.run();

        LazyLoading lazyLoading =LazyLoading.getInstance();
        lazyLoading.run("normal");

        LazyLoading syncInstance =LazyLoading.getSyncInstance();
        syncInstance.run("Synchronised");


        LazyLoading doubleCheckInstance =LazyLoading.getDoubleCheckInstance();
        doubleCheckInstance.run("Doublecheck Method");

        LazyLoading billPughInstance =LazyLoading.getBillPughInstance();
        billPughInstance.run("Bill Pugh ");
    }
}