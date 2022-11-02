
public class Circle extends Figure implements Print {

    int a = UserInterface.array[0];

    @Override
    public double calculateArea() {
        double S = Math.PI * a * a;
        return S;
    }

    @Override
    public double calculatePerimeter() {
        double P = 2 * Math.PI * a;
        return P;
    }

    @Override
    public void print() {
        System.out.println("Circle: radius: " + a + " perimeter: " + calculatePerimeter() + " area: "
                + calculateArea());
    }
}
