public class CheckoutService {
   private PaymentGatway paymentGatway;

    CheckoutService(String PAYMENT_TYPE){
        this.paymentGatway = PaymentFactory.getPayment(PAYMENT_TYPE);
    }
    void checkOut(String orderId , double amount){
        paymentGatway.pay(orderId , amount);
    }

}
