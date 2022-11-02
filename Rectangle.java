public class Rectangle extends Figure implements Print {
    private int a = UserInterface.array[0];
    private int b = UserInterface.array[1];

    @Override
    public double calculatePerimeter()
    {
        double P = a*2 + b*2;
        return P;
    }

    @Override
    public double calculateArea()
    {
        double S = a*b;
        return S;
    }

    @Override
    public void print()
    {
        System.out.println("Rectangle: side a: " + a + " side b: " + b + " perimeter: " + calculatePerimeter() + " area: " + calculateArea());
    }


}
