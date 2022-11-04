public class Square extends Rectangle {

    Square(int a) {
        super(a, a);
    }

    @Override
    public void print() {
        System.out.println("Square: perimeter: " + calculatePerimeter() + " area: " + calculateArea());
    }
}
