public class Circle extends Figure implements Print {

    private int r;

    Circle(int r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        double S = Math.PI * r * r;
        return S;
    }

    @Override
    public double calculatePerimeter() {
        double P = 2 * Math.PI * r;
        return P;
    }

    @Override
    public void print() {
        System.out.printf("Circle: circumference: %s, area = %s\n", calculatePerimeter(), calculateArea());
    }
}
