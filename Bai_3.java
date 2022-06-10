import java.util.Random;

public class Bai_3 {
    public static void main(String[] args) {
        Random rd = new Random();
        int  n = rd.nextInt();
        System.out.println(" so ngau nhien :" + n);
        if( isPrimeNumber(n)){
            System.out.println(n + " la so nguyen to");
        }else{
            System.out.println(n + " k la so nguyen to");
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
