package practicefirst;
import java.util.Scanner;

public class LineThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте значения переменным: x,y");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double reply = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
        System.out.println("Ответ: "+reply);
        in.close();
    }
}
