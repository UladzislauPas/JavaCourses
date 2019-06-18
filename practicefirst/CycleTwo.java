package practicefirst;
import java.util.Scanner;

public class CycleTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение a = ");
        double numA = in.nextDouble();
        System.out.println("Введите значение b = ");
        double numB = in.nextDouble();
        System.out.println("Введите значение шага: ");
        double numH = in.nextDouble();
        double x,y;
        for(x=numA;x<=numB-numH;x+=numH){
            if (x>2){
                y=x;
                System.out.println("Значение "+y);
            }else if (x<=2){
                y=-x;
                System.out.println("Значение "+y);
            }
        }
        in.close();
    }
}
