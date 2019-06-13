package practicefirst;
import java.util.Scanner;

public class BranchThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты точки А: ");
        double dotX1 = in.nextDouble();
        double dotY1 = in.nextDouble();
        System.out.println("Введите координаты точки В: ");
        double dotX2 = in.nextDouble();
        double dotY2 = in.nextDouble();
        System.out.println("Введите координаты точки C: ");
        double dotX3 = in.nextDouble();
        double dotY3 = in.nextDouble();
        double lineX = (dotX3-dotX1)/(dotX2-dotX1);
        double lineY = (dotY3-dotY1)/(dotY2-dotY1);
        if(lineX==lineY){
            System.out.println("Точки находятся на одной прямой");
        }else{
            System.out.println("Точки лежат на на одной прямой");
        }
        in.close();
    }
}
