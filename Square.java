
public class Square extends Figure implements Print {
    private int a = UserInterface.array[0];

    @Override
    public double calculatePerimeter()
    {
        double P = a*4;
        return P;
    }

    @Override
    public double calculateArea()
    {
        double S = a*a;
        return S;
    }

    @Override
    public void print()
    {
        System.out.println("Square: side a: " + a + " perimeter: " + calculatePerimeter() + " area: " + calculateArea());
    }
    
}
