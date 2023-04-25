package solid;

public class Circle implements Shape {
    private final int radius;
    public Circle(int radius) {this.radius=radius;}
    public int getRadius() {return radius;}
    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(),2);
    }

    // Let's say circle cannot calculate volume
    // We're telling circle to do what it can not do
    // Interfaces should not force classes to implement what they
    //    can't do.
    @Override
    public double volume() {
        return 0;
    }
}
