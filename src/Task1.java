// Завдання 1. Побудувати ієрархію класів відповідно до варіанта завдання.
// Згідно завдання вибрати суперклас (базовий клас) та підкласи (похідні класи). В
// класах задати поля, які характерні для кожного класу. Для всіх класів
// розробити метод Show(), який виводить дані про об’єкт класу. Розробити
// програму, яка вводить інформацію про об’єкти заданих сутностей згідно
// варіанту в масив типу суперкласу та друкує введений масив (з використанням
// методу Show() ) . 

// Іграшка, продукт, товар, молочний продукт.

class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void Show() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }
}

class Toy extends Product {
    private String type;

    public Toy(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Type: " + type);
    }
}

class Food extends Product {
    private String category;

    public Food(String name, double price, String category) {
        super(name, price);
        this.category = category;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Category: " + category);
    }
}

class DairyProduct extends Food {
    private String volume;

    public DairyProduct(String name, double price, String category, String volume) {
        super(name, price, category);
        this.volume = volume;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Volume: " + volume);
    }
}
