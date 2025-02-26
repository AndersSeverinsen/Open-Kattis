import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UnoReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a==2 && b!=0) {
            System.out.println("YES");
            return;
        } else if (b==0) {
            System.out.println("NO");
        } else if (b==1) {
            System.out.println("YES");
            return;
        } else if (b%2==0 && a>2 && b>=(a-1)*2) {
            System.out.println("MAYBE");
            return;
        } else if (b%2!=0 && a>2) {
            System.out.println("MAYBE");
            return;
        } else {
            System.out.println("NO");
        }
    }
}