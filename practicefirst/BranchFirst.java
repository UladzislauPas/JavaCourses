package practicefirst;
import java.util.Scanner;

public class BranchFirst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение для угла A:");
        double cornerA = in.nextDouble();
        System.out.println("Введите значение для угла B:");
        double cornerB = in.nextDouble();
        double cornerC = 180-cornerA-cornerB;
        if (cornerC<=0){
            System.out.println("Треугольника с такими углами не существует.");
            System.exit(0);
        }else {
            System.out.println("Треугольник существует.");
        }
        if (cornerA==90 || cornerB==90 || cornerC==90){
            System.out.println("Треугольник прямоугольный");
        }
        in.close();
    }
}
