package Part5.Exercise3;

public record Rectangle(double base, double height) implements GeometricForm{
    @Override
    public double getArea() {
        return base*height;
    }
}
