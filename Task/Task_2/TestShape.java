public class TestShape {
    public static void main(String[] args) {
        // Uji coba kelas Shape
        Shape shape1 = new Shape();
        System.out.println("Shape 1: " + shape1);
        Shape shape2 = new Shape("blue", false);
        System.out.println("Shape 2: " + shape2);
        System.out.println("--------------------");

        // Uji coba kelas Circle
        Circle circle1 = new Circle(5.5, "yellow", true);
        System.out.println("Circle 1    : " + circle1);
        System.out.println("Radius      : " + circle1.getRadius());
        System.out.println("Area        : " + String.format("%.2f", circle1.getArea()));
        System.out.println("Perimeter   : " + String.format("%.2f", circle1.getPerimeter()));
        System.out.println("--------------------");

        // Uji coba kelas Rectangle
        Rectangle rect1 = new Rectangle(3.0, 7.0, "purple", false);
        System.out.println("Rectangle 1 : " + rect1);
        System.out.println("Width       : " + rect1.getWidth());
        System.out.println("Lenght      : " + rect1.getLength());
        System.out.println("Area        : " + rect1.getArea());
        System.out.println("Perimeter   : " + rect1.getPerimeter());
        System.out.println("--------------------");

        // Uji coba kelas Square
        Square square1 = new Square(6.0, "black", true);
        System.out.println("Square 1    : " + square1);
        System.out.println("Width       : " + square1.getWidth());
        System.out.println("Lenght      : " + square1.getLength());
        System.out.println("Area        : " + square1.getArea());
        System.out.println("Perimeter   : " + square1.getPerimeter());
        System.out.println("--------------------");
        
        // Mengubah sisi square dan melihat dampaknya
        square1.setSide(8.0);
        System.out.println("\nAfter setting side to 8.0:");
        System.out.println("Square 1    : " + square1);
        System.out.println("Length      : " + square1.getLength());
        System.out.println("Width       : " + square1.getWidth());
        System.out.println("--------------------");
    }
}