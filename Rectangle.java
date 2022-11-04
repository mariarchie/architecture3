public class Rectangle extends Figure implements Print {
    private int a;
    private int b;

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculatePerimeter() {
        double P = a * 2 + b * 2;
        return P;
    }

    @Override
    public double calculateArea() {
        double S = a * b;
        return S;
    }

    @Override
    public void print() {
        System.out.println("Rectangle: perimeter: " + calculatePerimeter() + " area: " + calculateArea());
    }

}
