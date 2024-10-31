import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void testProductShow() {
        Product product = new Product("Generic Product", 10.0);
        product.Show();
    }

    @Test
    void testToyShow() {
        Toy toy = new Toy("Action Figure", 15.0, "Action");
        toy.Show();
    }

    @Test
    void testFoodShow() {
        Food food = new Food("Bread", 2.5, "Bakery");
        food.Show();
    }

    @Test
    void testDairyProductShow() {
        DairyProduct dairyProduct = new DairyProduct("Milk", 1.5, "Dairy", "1L");
        dairyProduct.Show();
    }

    @Test
    void testProductAttributes() {
        Product product = new Product("Generic Product", 10.0);
        assertEquals("Generic Product", product.name);
        assertEquals(10.0, product.price);
    }

    @Test
    void testToyAttributes() {
        Toy toy = new Toy("Action Figure", 15.0, "Action");
        assertEquals("Action Figure", toy.name);
        assertEquals(15.0, toy.price);
        assertEquals("Action", toy.type);
    }

    @Test
    void testFoodAttributes() {
        Food food = new Food("Bread", 2.5, "Bakery");
        assertEquals("Bread", food.name);
        assertEquals(2.5, food.price);
        assertEquals("Bakery", food.category);
    }

    @Test
    void testDairyProductAttributes() {
        DairyProduct dairyProduct = new DairyProduct("Milk", 1.5, "Dairy", "1L");
        assertEquals("Milk", dairyProduct.name);
        assertEquals(1.5, dairyProduct.price);
        assertEquals("Dairy", dairyProduct.category);
        assertEquals("1L", dairyProduct.volume);
    }
}
