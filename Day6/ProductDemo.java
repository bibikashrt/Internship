class Product {

    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class ProductDemo {

    public static void main(String[] args) {

        Product p = new Product();

        p.setPrice(1000);

        System.out.println("Price: " + p.getPrice());
    }
}