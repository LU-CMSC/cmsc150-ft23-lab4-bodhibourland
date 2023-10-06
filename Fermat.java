import java.util.Scanner;
import java.lang.Math;

public class Fermat {
    public static void main(String[]args){
    System.out.print("Fermat’s Last Theorem says that there are no integers \n a, b, c, and n such that a^n + b^n = c^n, except when n ≤ 2. Give values \nfor a, b, c, and n (in that order, and make sure n > 2) to test this theory:\n");
    int a;
    int b;
    int c;
    int n;
    Scanner in = new Scanner(System.in);
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();
    n = in.nextInt();
        if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c,n)){
            System.out.println("Holy smokes! Fermat was wrong!");
        } else{
            System.out.println("Nope, Fermat's Theorem still holds");
        }
    }
}
