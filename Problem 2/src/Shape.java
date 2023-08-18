public abstract class Shape implements Scalable {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
