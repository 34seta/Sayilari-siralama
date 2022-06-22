import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("1.sayiyi giriniz:");
        a = input.nextInt();

        System.out.print("2.sayiyi giriniz: ");
        b = input.nextInt();

        System.out.print("3.sayiyi giriniz: ");
        c = input.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.print("a>b>c");
            } else {
                System.out.print("a>c>b");
            }
        } else if (b > c && b > a) {
            if (a > c) {
                System.out.print("b>a>c");
            } else {
                System.out.print("b>c>a");
            }
        } else if (c > a && c > b) {
            if(b>a){
                System.out.print("c>b>a");
            }else {
                System.out.println("c>a>b");
            }




        }


    }
}