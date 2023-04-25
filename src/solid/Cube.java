package solid;

public class Cube implements Shape,Shape3D{
    @Override
    public double area() {
        return 100;
    }

    // Now, we're leaving the classes which cannot calculate volume untouched
    // We've implemented new shape3d interface for 3D shapes
    // We've also divided large interface into smaller ones.
    @Override
    public double volume() {
        return 0;
    }
}
