public interface PaymentGatway {
    void pay(String orderId , double amount);
}

class PayU implements PaymentGatway{
        public void pay(String orderId , double amount){
            System.out.println("Process for Order ID : " + orderId + " Amount : " + amount + " is completed using PayU");
        }
}

class RazorPay{
    public void makePayment(String orderId , double amount){
        System.out.println("Process for Order ID : " + orderId + " Amount : " + amount + " is completed using RazorPay");
    }
}


class RazorPayAdaptor implements PaymentGatway{
    private RazorPay razorPay;

    RazorPayAdaptor(){
        this.razorPay = new RazorPay();
    }

    @Override
    public void pay(String orderId, double amount) {
        this.razorPay.makePayment(orderId , amount);
    }
}


