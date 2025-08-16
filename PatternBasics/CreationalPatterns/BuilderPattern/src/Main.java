public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart.CartBuilder()
                .addItem("Mouse" , 100 , 2)
                .addItem("TV" , 155000 , 1)
                .build();

        System.out.println(cart);

    }
}