package practicefirst;
import java.math.*;

public class CycleFour {
    public static void main(String[] args) {
        BigInteger i = new BigInteger("1");
        BigInteger max = new BigInteger("200");
        BigInteger result = new BigInteger("1");
        BigInteger a,square;
        for(a = i ; !a.equals(max); a=a.add(i)){
            square = a.multiply(a);
            result = square.multiply(result);
        }
        System.out.println("Произведение квадратов первых 200 чисел = "+result);
    }
}
