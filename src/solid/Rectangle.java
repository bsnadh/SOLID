package solid;

public class Rectangle implements Shape{
    @Override
    public double area() {
        return 20;
    }

    // Interfaces should not force classes to implement what they
    //    can't do.
    @Override
    public double volume() {
        return 0;
    }
}
