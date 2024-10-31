import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {

    @Test
    public void testFigures() {
        Figure[] figures = new Figure[3];
        figures[0] = new Rectangle(5, 10);
        figures[1] = new Circle(7);
        figures[2] = new Trapezium(3, 4, 5, 6, 7);

        for (Figure figure : figures) {
            assertNotNull(figure);
            assertTrue(figure.calculateArea() >= 0);
            assertTrue(figure.calculatePerimeter() >= 0);
        }
    }

    @Test
    public void testRectangleEquals() {
        Rectangle rect1 = new Rectangle(5, 10);
        Rectangle rect2 = new Rectangle(5, 10);
        Rectangle rect3 = new Rectangle(10, 5);
        assertEquals(rect1, rect2);
        assertNotEquals(rect1, rect3);
    }

    @Test
    public void testCircleEquals() {
        Circle circle1 = new Circle(7);
        Circle circle2 = new Circle(7);
        Circle circle3 = new Circle(10);
        assertEquals(circle1, circle2);
        assertNotEquals(circle1, circle3);
    }

    @Test
    public void testTrapeziumEquals() {
        Trapezium trap1 = new Trapezium(3, 4, 5, 6, 7);
        Trapezium trap2 = new Trapezium(3, 4, 5, 6, 7);
        Trapezium trap3 = new Trapezium(7, 6, 5, 4, 3);
        assertEquals(trap1, trap2);
        assertNotEquals(trap1, trap3);
    }

    @Test
    public void testAdditionalCases() {
        Rectangle rect4 = new Rectangle(0, 0);
        assertEquals(0, rect4.calculateArea());
        assertEquals(0, rect4.calculatePerimeter());

        Circle circle4 = new Circle(0);
        assertEquals(0, circle4.calculateArea());
        assertEquals(0, circle4.calculatePerimeter());

        Trapezium trap4 = new Trapezium(0, 0, 0, 0, 0);
        assertEquals(0, trap4.calculateArea());
        assertEquals(0, trap4.calculatePerimeter());

        Rectangle rect5 = new Rectangle(5, 10);
        assertNotEquals(rect4, rect5);

        Circle circle5 = new Circle(7);
        assertNotEquals(circle4, circle5);

        Trapezium trap5 = new Trapezium(3, 4, 5, 6, 7);
        assertNotEquals(trap4, trap5);
    }
}
