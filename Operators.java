public class Operators {
    public static void main(String[] args) {
        // Variables
        int a = 10, b = 5;
        boolean x = true, y = false;
        String str = "Hello";

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
        System.out.println("a << 1: " + (a << 1));
        System.out.println("a >> 1: " + (a >> 1));

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = a;
        System.out.println("c = a: " + c);
        c += 5;
        System.out.println("c += 5: " + c);
        c -= 3;
        System.out.println("c -= 3: " + c);
        c *= 2;
        System.out.println("c *= 2: " + c);
        c /= 4;
        System.out.println("c /= 4: " + c);
        c %= 3;
        System.out.println("c %= 3: " + c);

        // Unary Operators
        System.out.println("\nUnary Operators:");
        int d = 5;
        System.out.println("d: " + d);
        System.out.println("d++: " + (d++));
        System.out.println("After d++: " + d);
        System.out.println("++d: " + (++d));
        System.out.println("d--: " + (d--));
        System.out.println("After d--: " + d);
        System.out.println("--d: " + (--d));

        // Ternary Operator
        System.out.println("\nTernary Operator:");
        int min = (a < b) ? a : b;
        System.out.println("Minimum: " + min);

        // Instanceof Operator
        System.out.println("\nInstanceof Operator:");
        System.out.println("str instanceof String: " + (str instanceof String));
    }
}
