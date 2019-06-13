package practicefirst;
import java.util.Scanner;

public class LineFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длительность прошедшего времени в секундах:");
        int T = in.nextInt();
        double hour = (double)(T)/3600;
        int hh = (int)hour;
        double minute = (hour - hh)*60;
        int mm = (int)minute;
        double second = (minute-mm)*60;
        int ss = (int)(Math.round(second));
        System.out.println("Прошло: "+hh+"ч "+mm+"мин "+ss+"с");
        in.close();
    }
}
