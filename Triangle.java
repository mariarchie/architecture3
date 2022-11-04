public class Triangle extends Figure implements Print {
    private int a;
    private int b;
    private int c;

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculatePerimeter() {
        double P = a + b + c;
        return P;
    }

    @Override
    public double calculateArea() {
        double P = a + b + c;
        double S = Math.sqrt(P / 2 * (P / 2 - a) * (P / 2 - b) * (P / 2 - c));
        return S;
    }

    @Override
    public void print() {
        System.out.printf("Triangle: perimeter: %s, area = %s\n", calculatePerimeter(), calculateArea());
    }

}
