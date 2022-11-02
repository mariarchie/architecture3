public class Triangle extends Figure implements Print {
    private int a = UserInterface.array[0];
    private int b = UserInterface.array[1];
    private int c = UserInterface.array[2];

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
        System.out.println("Triangle: side a: " + a + " side b: " + b + " side c: " + c + " perimeter: "
                + calculatePerimeter() + " area: " + calculateArea());
    }

}
