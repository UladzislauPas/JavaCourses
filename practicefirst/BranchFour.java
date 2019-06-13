package practicefirst;
import java.util.Scanner;

public class BranchFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину отверстия: ");
        double sizeA = in.nextDouble();
        System.out.println("Введите ширину отверстия: ");
        double sizeB = in.nextDouble();
        System.out.println("Задайте длину кирпича: ");
        double brickX = in.nextDouble();
        System.out.println("Задайте ширину кирпича: ");
        double brickY = in.nextDouble();
        System.out.println("Задайте высоту кирпича: ");
        double brickZ = in.nextDouble();
        if(sizeA>=brickX && sizeB>=brickY || sizeA>=brickY && sizeB>=brickZ || sizeA>=brickZ && sizeB>=brickX ){
            System.out.println("Кирпич влезет в отверстие.");
        }else {
            System.out.println("Кирпич не влезет в отверстие.");
        }
        in.close();
    }
}
