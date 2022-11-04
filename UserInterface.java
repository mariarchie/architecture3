import java.util.Scanner;

public class UserInterface {
    static void userInterface() {
        try (Scanner name = new Scanner(System.in)) {
            System.out.println("Pls, enter your shape: circle / rectangle / square / triangle");
            String input = name.nextLine();
            switch (input) {
                case "circle":
                    System.out.println("Circle");
                    Main.inputCircle();
                    break;
                case "rectangle":
                    System.out.println("Rectangle");
                    Main.inputRectangle();
                    break;
                case "square":
                    System.out.println("Square");
                    Main.inputSquare();
                    break;
                case "triangle":
                    System.out.println("Triangle");
                    Main.inputTriangle();
                    break;
                default:
                    System.out.println("Incorrect name, pls, try again");
                    userInterface();
                    break;
            }
        }
    }
}