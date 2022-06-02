import java.util.Random;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap vao 1 so tu nhien bat ki :");
        number = sc.nextInt();
        Random rd = new Random();
        int a = rd.nextInt(100);
        System.out.println(" So bat ki:" +  a);
        System.out.println((number > a )? number + " > " + a : number + " < " + a);
    }
}
