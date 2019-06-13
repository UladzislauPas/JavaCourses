package practicefirst;
import java.util.Scanner;

public class BranchTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение a:");
        double numA = in.nextDouble();
        System.out.println("Введите значение b:");
        double numB = in.nextDouble();
        System.out.println("Введите значение c:");
        double numC = in.nextDouble();
        System.out.println("Введите значение d:");
        double minFirst,minTwo;
        double numD = in.nextDouble();
        if(numA>=numB){
            minFirst = numB;
            System.out.println("b = "+numB);
        }else{
            minFirst = numA;
            System.out.println("a = "+numA);
        }
        if (numC>=numD){
            minTwo = numD;
            System.out.println("d = "+numD);
        }else{
            minTwo = numC;
            System.out.println("c = "+numC);
        }
        System.out.println("Сравниеваем эти два значения...");
        if(minFirst>minTwo){
            System.out.println("Максимальное значение = "+minFirst);
        }else{
            System.out.println("Максимальное значение = " + minTwo);
        }
        in.close();
    }
}
