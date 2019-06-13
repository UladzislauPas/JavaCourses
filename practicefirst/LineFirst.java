package practicefirst;
import java.util.Scanner;

public class LineFirst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значения для переменных a,b,c");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double z = ((a-3)*b/2)+c;
        System.out.println("Функция z = "+z);
        in.close();
    }
}
