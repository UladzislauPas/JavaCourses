package practicefirst;
import java.util.Scanner;

public class BranchFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение переменной X: ");
        double numX = in.nextDouble();
        if (numX<=3){
            double function = Math.pow(numX,2)-3*numX+9;
            System.out.println("Функция F(x) = "+function);
        }else{
            double function = 1/(Math.pow(numX,3)+6);
            System.out.println("Функция F(x) = "+function);
        }
        in.close();
    }
}
