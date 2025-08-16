import java.util.ArrayList;
import java.util.List;

public class Cart {
    private double totalPrice;
    private int quantity;
    private List<String> product;
    private String couponCode;
    private boolean giftwrap;
    private String deliveryOption;

    Cart(CartBuilder cartBuilder){
        this.product = cartBuilder.product;
        this.totalPrice = cartBuilder.totalPrice;
        this.couponCode = cartBuilder.couponCode;
        this.giftwrap = cartBuilder.giftwrap;
        this.deliveryOption = cartBuilder.deliveryOption;
    }

    @Override
    public String toString(){
        return "Cart{" +
                "product =" + product +
                ", totalPrice=" + totalPrice +
                ", couponCode='" + couponCode + '\'' +
                ", giftWrap=" + giftwrap +
                ", deliveryOption='" + deliveryOption + '\'' +
                '}';
    }
    public static class CartBuilder{
        private double totalPrice;
        private int quantity;
        private List<String> product = new ArrayList<>();
        private String couponCode;
        private boolean giftwrap;
        private String deliveryOption;

        public CartBuilder addItem(String item , double price , int quantity){
            product.add(item);
            this.totalPrice += price * quantity;
            return this;
        }
        public CartBuilder applyCoupon(String couponCode){
            this.couponCode = couponCode;
            return this;
        }

        public CartBuilder setGiftWrap(boolean giftwrap){
            this.giftwrap = giftwrap;
            if(giftwrap == true){
                this.totalPrice += 5;
            }
            return this;
        }

        public CartBuilder deliveryOption(String deliveryOption){
            this.deliveryOption = deliveryOption;
            return this;
        }

        public Cart build(){
            return new Cart(this);
        }
    }
}
