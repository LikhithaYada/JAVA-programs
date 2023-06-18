package programs;
import java.util.Scanner;

class Operators {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = s.nextInt();
        System.out.println("Enter the value of b:");
        int b = s.nextInt();

        // Arithmetic operators
        int c = a + b;
        System.out.println("a + b = " + c);
        int d = a - b;
        System.out.println("a - b = " + d);
        int e = a * b;
        System.out.println("a * b = " + e);

        // Assignment operator
        int var = a;

        // Relational operators
        if (a < b)
            System.out.println("a is less than b");
        else if (a > b)
            System.out.println("a is greater than b");
        else
            System.out.println("a is equal to b");

        // Logical operators
        System.out.println((a > b) && (a == b));
        System.out.println((a > b) || (a < b));

        // Increment and decrement operators
        System.out.println(++a);
        System.out.println(--b);

        // Ternary operator
        int februaryDays = 29;
        String result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(result);

        s.close();
    }
}
