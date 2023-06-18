package programs;

import java.util.*;

public class Calculator1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a value:");
        int a = s.nextInt();
        System.out.println("enter b value:");
        int b = s.nextInt();
        System.out.println("enter option: 1, 2, 3, 4, 5");
        int op = s.nextInt();
        int res;

        switch (op) {
            case 1:
                res = a + b;
                System.out.println("res:" + res);
                break;
            case 2:
                res = a - b;
                System.out.println("res:" + res);
                break;
            case 3:
                res = a * b;
                System.out.println("res:" + res);
                break;
            case 4:
                res = a / b;
                System.out.println("res:" + res);
                break;
            case 5:
                res = a % b;
                System.out.println("res:" + res);
                break;
            default:
                System.out.println("invalid operator");
                break;
        }
    }
}
