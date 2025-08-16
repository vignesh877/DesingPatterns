public interface Payment {
    void makePayment();
}

class UpiPayment implements Payment{
    public void makePayment(){
        System.out.println("upi payment done in INR");
    }
}

class PayU implements Payment{
    public void makePayment(){
        System.out.println("PayU payment done in INR");
    }
}

class Strip implements Payment{
    public void makePayment(){
        System.out.println("Strip payment done in US");
    }
}

class Card implements Payment{
    public void makePayment(){
        System.out.println("Cards payment done in INR");
    }
}