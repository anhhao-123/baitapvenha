import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = sc.nextLine();

        for (int i = 0; i < chuoi.length(); i++) {
            kyTu = chuoi.charAt(chuoi.length() - i - 1);

            if (chuoi.charAt(i) == kyTu) {
                System.out.println("Chuỗi này là chuỗi Panlyndrome.");
                break;
            } else {
                System.out.println("Chuỗi này không là chuỗi Panlyndrome.");
                break;
            }
        }
    }
}
