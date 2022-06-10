import java.util.StringTokenizer;

public class Bai_2 {
    public static void main(String[] args) {
        String str = " You only live once, but if you do it right, once is enough ";
        StringTokenizer a =  new StringTokenizer(str);
        int soTuTrongChuoi = a.countTokens();
        System.out.println(" So tu trong chuoi la:" + str + " = " + soTuTrongChuoi);
        char kyTu  = 'o';
        int count = 0 ;
        for( int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == kyTu){
                count++;
            }
        }
        System.out.println(" So lan xuat hien cua ky tu" + kyTu + " trong chuoi " + str +" = " + count);
    }


}


