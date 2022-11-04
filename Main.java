import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInterface.userInterface();
    }

    static void inputCircle() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Pls, enter radius for circle");
            int r = s.nextInt();
            if (r < 0) {
                checkParamAlert();
            } else {
                Figure thisCircle = new Circle(r);
                thisCircle.calculateArea();
                thisCircle.calculatePerimeter();
                ((Circle) thisCircle).print();
            }
        }
    }

    static void inputRectangle() {
        try (Scanner s1 = new Scanner(System.in)) {
            System.out.println("Pls, enter side a for rectangle");
            try (Scanner s2 = new Scanner(System.in)) {
                System.out.println("Pls, enter side b for rectangle");
                int a = s1.nextInt();
                int b = s2.nextInt();
                if (a < 0 || b < 0) {
                    checkParamAlert();
                } else {
                    Figure thisRectangle = new Rectangle(a, b);
                    thisRectangle.calculateArea();
                    thisRectangle.calculatePerimeter();
                    ((Rectangle) thisRectangle).print();
                }
            }
        }
    }

    static void inputSquare() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Pls, enter side for square");
            int a = s.nextInt();
            if (a < 0) {
                checkParamAlert();
            } else {
                Figure thisSquare = new Square(a);
                thisSquare.calculateArea();
                thisSquare.calculatePerimeter();
                ((Square) thisSquare).print();
            }
        }
    }

    static void inputTriangle() {
        try (Scanner s1 = new Scanner(System.in)) {
            System.out.println("Pls, enter side a for triangle");
            try (Scanner s2 = new Scanner(System.in)) {
                System.out.println("Pls, enter side b for triangle");
                try (Scanner s3 = new Scanner(System.in)) {
                    System.out.println("Pls, enter side c for triangle");
                    int a = s1.nextInt();
                    int b = s2.nextInt();
                    int c = s3.nextInt();

                    if (((a + b) > c) && ((a + c) > b) && ((c + b) > a)) {

                        Figure thisTriangle = new Triangle(a, b, c);
                        thisTriangle.calculateArea();
                        thisTriangle.calculatePerimeter();
                        ((Triangle) thisTriangle).print();
                    } else {
                        checkParamAlert();
                        System.out.println("This triangle doesn't exist!");
                    }
                }
            }
        }
    }

    private static void checkParamAlert() {
        System.out.println("Wrong parameters!");
    }
}
