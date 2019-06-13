package practicefirst;
import java.util.Scanner;

public class LineFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение в формате nnn.ddd");
        double R = in.nextDouble();
        int whole = (int)R;
        double fractional = R-whole; // Получаем дробную часть
        double conversion = fractional*1000;
        int newFractional = (int)(Math.round(conversion));
        System.out.print(newFractional+","+whole);
        in.close();
    }
}
