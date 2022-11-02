import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main (String[] args)
    {
        List <Circle> circles = new ArrayList<>();
        List <Triangle> triangles = new ArrayList<>();
        List <Square> squares = new ArrayList<>();
        List <Rectangle> rectangles = new ArrayList<>();

        UserInterface.userInterface();

        ((Circle) circles).print();
        ((Rectangle) rectangles).print();
        ((Square) squares).print();
        ((Triangle) triangles).print();
    }
}


