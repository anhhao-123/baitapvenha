import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        int soDong,soCot;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap so dong:");
        soDong = sc.nextInt();
        System.out.println(" Nhap so cot");
        soCot = sc.nextInt();
        int[][] numbers = new int[soDong][soCot];
        for( int i =0; i<soDong;i++){
            for( int j = 0; j<soCot;j++){
                System.out.print(" Nhap phan thu tu[%d][%d]:");
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println(" Mang vua nhap la:");
        for( int i =0; i <soDong ;i++){
            for( int j = 0; j<soCot;j++){
                System.out.print(numbers[i][j] + " \t");
            }
        }
        System.out.println(" \n");
    }
}
