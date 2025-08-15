interface RegionalPayment{
    Invoices getInvoices();
    Payment createPayment(String PAYMENT_TYPE);
}

class IndianFactory implements RegionalPayment{
    public Payment createPayment(String PAYMENT_TYPE){
        if(PAYMENT_TYPE.equals("UpiPayment"))
            return new UpiPayment();
        else{
            return new Card();
        }
    }
    public Invoices getInvoices(){
        return new GST();
    }
}

class AUEFactory implements RegionalPayment{
    public Payment createPayment(String PAYMENT_TYPE){
        if(PAYMENT_TYPE.equals("PayU"))
            return new PayU();
        else{
            return new Strip();
        }
    }
    public Invoices getInvoices(){
        return new BAT();
    }
}
