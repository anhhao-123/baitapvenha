import java.lang.String;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        System.out.println("Nhap mot chuoi: a");
        Scanner input = new Scanner(System.in);
        char str[] = input.nextLine().toCharArray();
        int temp = 0;
        for (int i = 0; i < str.length; i++){
            if(str[i] == 'e'){
                temp++;
            }
        }
        System.out.println("Trong chuoi co: " + temp +" chu e");
    }
}
