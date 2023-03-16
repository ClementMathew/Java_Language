
import java.util.*;

public class Fibinocci_Series {
    public void fibo(int num) {
        System.out.println("\n The Fibnacci Series Upto " + num + " Is:\n");
        int n1 = 0, n2 = 1;
        while (n1 < num) {
            System.out.println(n1);
            n2 = n1 + n2;
            n1 = n2 - n1;
        }
    }

    public static void main(String args[]) {
        Fibinocci_Series obj1 = new Fibinocci_Series();
        System.out.println("Enter The Limit : ");
        try (Scanner sc = new Scanner(System.in)) {
            obj1.fibo(sc.nextInt());
        }
    }
}
