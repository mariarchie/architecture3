
import java.util.Scanner;

public class UserInterface {

    public static int[] array = new int[5];

    static int[] userInterface() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter sides' (radius for circle) dimensions splitted by a space");
            String s[] = scanner.nextLine().split(" ");
            for (int i = 0; i < s.length; i++) {
                array[i] = Integer.parseInt(s[i]);
            }
            if (array.length == 1) {
                new Circle();

            }
            if (array.length == 2) {
                if (array[0] == array[1]) {
                    new Square();
                } 
                new Rectangle();
            }

            if (array.length == 3) {
                new Triangle();
            }

            return array;

        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}