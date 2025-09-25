package record;

public class RecordExample {

    public static void main(String[] args) {

        Product product = new Product("Samsung 24 Ultra","mobile");
        System.out.println("the product name is "+product.name() +" of type "+product.type());

        Product product1 = new Product("","");
        System.out.println(product1);

        Product product2 = new Product("Iphone");
        System.out.println(product2);
    }
}
