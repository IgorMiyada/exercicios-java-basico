package Part5.Exercise3;

public record Circle(double radius) implements GeometricForm{

    static final double pi = 3.14;

    @Override
    public double getArea() {
        return pi * radius;
    }
}
