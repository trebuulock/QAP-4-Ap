public class Ellipse extends Shape {
    private double a; // major axis
    private double b; // minor axis

    public Ellipse(double a, double b) {
        super("Ellipse");
        this.a = Math.max(a, b);
        this.b = Math.min(a, b);
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((a * a + b * b) / 2);
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Major Axis: " + a + ", Minor Axis: " + b;
    }
}
