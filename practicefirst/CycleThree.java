package practicefirst;

public class CycleThree {
    public static void main(String[] args) {
        int i = 1;
        int level = 2;
        int result = 0;
        while(i<=100){
            int square = (int) Math.pow(i,level);
            result=result+square;
            i++;
        }
        System.out.println("Сумма квадратов первых 100 чисел = "+result);
    }
}
