public class Main {

    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Toy("Lego", 29.99, "Building Blocks");
        products[1] = new Food("Apple", 0.99, "Fruit");
        products[2] = new DairyProduct("Milk", 1.49,"Dairy", "1 liter");

        for (Product product : products) {
            product.Show();
        }
    }
}
