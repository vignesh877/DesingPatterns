public class PaymentService {
    private Payment payment;
    private Invoices invoices;
    private String gatwayType;

    PaymentService(RegionalPayment regionalPayment , String gatwayType){
        this.gatwayType = gatwayType;
        this.payment = regionalPayment.createPayment(gatwayType);
        this.invoices = regionalPayment.getInvoices();
    }

    public void checkOut(){
        payment.makePayment();
        invoices.generateInvoice();
    }
}
