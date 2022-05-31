public class bai2 {
    public static void main(String[] args) {
        int i = 10;
        int j = i++;
        int k = ++i;
        System.out.println(" j =" + j);
        System.out.println(" k =" + k);
        System.out.println((j>k)?" Dung " : " Sai");
    }
}
