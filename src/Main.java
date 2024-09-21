public class Main {

    public static void main(String[] args) {
        
        Product[] products = new Product[3];
        products[0] = new Toy("Lego", 29.99, "Building Blocks");
        products[1] = new Food("Apple", 0.99, "Fruit");
        products[2] = new DairyProduct("Milk", 1.49,"Dairy", "1 liter");

        for (Product product : products) {
            product.Show();
        }

        Figure[] figures = new Figure[3];
        figures[0] = new Rectangle(5, 10);
        figures[1] = new Circle(7);
        figures[2] = new Trapezium(3, 5, 4, 6, 4);

        for (Figure figure : figures) {
            System.out.println(figure);
            System.out.println("Area: " + figure.calculateArea());
            System.out.println("Perimeter: " + figure.calculatePerimeter());
            System.out.println();
        }
    }
}
