package practicefirst;
import java.util.Scanner;

public class LineTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значения для переменных: a,b,c");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double reply = (b+Math.sqrt(Math.pow(b,2)+4*a*c))/(2*a)-Math.pow(a,3)*c+Math.pow(b,-2);
        System.out.println("Ответ: "+reply);
        in.close();
    }
}
