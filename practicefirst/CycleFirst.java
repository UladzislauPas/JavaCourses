package practicefirst;
import java.util.Scanner;

public class CycleFirst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int numN = in.nextInt();
        int i = 0;
        int sum = 0;
        if (numN<=0){
            System.out.println("Вы ввели отрицательно число!!!");
            System.exit(0);
        }
        while(i <= numN){
            sum = sum+i;
            i++;
        }
        System.out.println("Сумма чисел: "+sum);
    }
}
