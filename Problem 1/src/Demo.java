public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Ellipse(4.0, 6.0);
        shapes[2] = new Triangle(3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle(3.0);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
