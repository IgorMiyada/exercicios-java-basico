package Part5.Exercise3;

public record Square(double sideSize) implements GeometricForm{
    @Override
    public double getArea() {
        return sideSize*sideSize;
    }
}
