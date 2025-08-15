public interface Invoices{
    void generateInvoice();
}

class GST implements Invoices{
    @Override
    public void generateInvoice() {
        System.out.println("GST invoice Generated ");
    }
}

class BAT implements Invoices{
    @Override
    public void generateInvoice() {
        System.out.println("BAT invoice Generated");
    }
}