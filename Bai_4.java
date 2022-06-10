import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
         display();
    }
    public static boolean Nguyento(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n) ; i++)
            if( n%i == 0 ) return false;
       return  true;
    }
    public static void display(){
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int i = 2;
        int count = 0;
        while (count <= num){
            if(Nguyento(i)){
                System.out.println(" " + i);
                count++;
            }
            i++;
        }
    }
}