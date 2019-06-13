package practicefirst;
import java.util.Scanner;

public class LineSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координату 'Х' для точки А");
        double x = in.nextDouble();
        System.out.println("Введите координату 'У' для точки А");
        double y = in.nextDouble();
        boolean check = (x>=-2 && x<=2 && y<=4)||(x>=-4 && x<=4 && y>=-3);
        System.out.println("Точка A принадлежит закрашенной области?: "+check);
    }
}
