// Завдання 2. Реалізувати абстрактний базовий клас з вказаними абстрактними
// методами. Створити підкласи(похідні класи) суперкласу( базового класу), в
// яких здійснити реалізацію всіх абстрактних методів. Самостійно визначити, які
// поля необхідні і які з них визначити в базовому класі, а які – в похідних.
// В похідних класах мають бути перевантажені методи toString та equal.
// Створити масив об’єктів . Проілюструвати роботу всіх методів
// підкласів(похідних класів).

// 1. Створити абстрактний базовий клас Figure з абстрактними методами
// обчислення площі і периметру. Створити похідні класи: Rectangle
// (прямокутник), Circle (коло), Trapezium (трапеція) зі своїми функціями
// для обчислення площі і периметра.
abstract class Figure {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    @Override
    public abstract String toString();

    @Override
    public abstract boolean equals(Object obj);
}

class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return Double.compare(rectangle.width, width) == 0 &&
               Double.compare(rectangle.height, height) == 0;
    }
}

class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0;
    }
}

class Trapezium extends Figure {
    private double a, b, c, d, height;

    public Trapezium(double a, double b, double c, double d, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((a + b) / 2) * height;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c + d;
    }

    @Override
    public String toString() {
        return "Trapezium [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", height=" + height + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Trapezium trapezium = (Trapezium) obj;
        return Double.compare(trapezium.a, a) == 0 &&
               Double.compare(trapezium.b, b) == 0 &&
               Double.compare(trapezium.c, c) == 0 &&
               Double.compare(trapezium.d, d) == 0 &&
               Double.compare(trapezium.height, height) == 0;
    }
}