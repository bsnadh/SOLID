package solid;

public class NoShape implements Shape{
    // Derived class NoShape is not substitutable for their base or parent class
    // We're implying that NoShape is a shape, but it can not calculate area
    // It can not also obey the contract of the Shape interface
    @Override
    public double area() {
        throw new IllegalStateException("Cannot calculate area.");
    }
}
