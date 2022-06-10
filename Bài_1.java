import java.util.Scanner;

public class Bài_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n==0){
            System.out.println(" nhap n:");
            n = sc.nextInt();
        }
        for( int i = 0; i<n ; i++){
            for( int j = 0;j<n; j++){
                System.out.printf("*" );
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i <=n ; i++){
            for( int j = 0 ; j <= i ; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
