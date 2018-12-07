import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter number:");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        System.out.println(sumDouble(m, n, s));


    }
    public static int sumDouble(int m, int n, int s) {
        if (m>n && m>s){
            return m;
        }else if(n>m && n>s) {
            return n;
        } else if(s>m && s>n) {
            return s;
        } else {
            return s;}
    }
}