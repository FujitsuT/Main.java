import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {new Triangle(5, 8, 6),
                            new Rectangle(5, 7),
                            new Circle(10)};
        double sum = 0;
        for (Figure fig : figures) {
            sum = sum + fig.getPerimetr();
        }
        System.out.println(sum);
    }
}