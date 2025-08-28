public class PaymentFactory {
    public static PaymentGatway getPayment(String PAYMENT_TYPE){
        if(PAYMENT_TYPE.equalsIgnoreCase("PayU")){
            return new PayU();
        }else if (PAYMENT_TYPE.equalsIgnoreCase("razorPay")) {
            return new RazorPayAdaptor();
        }
        throw new IllegalArgumentException("Unknown payment type: " + PAYMENT_TYPE);
    }
}
