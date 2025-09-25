package record;

public record Product(String name, String type) {
    public Product {
        if (name != null || name.isBlank()) {
            System.out.println("name is empty");
        }
    }

    //custom constructor
    public Product(String name) {
        this(name,"mobile");
    }

}
