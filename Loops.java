public class Loops {
    public static void main(String[] args) {
        
        // 1. For Loop 
        // Syntax: 
        // for(initialization; condition; increment/decrement) 
        //     { // code } 
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) { // Initialization → Condition → Increment
            System.out.print(i + " ");
        }

        // 2. While Loop 
        // Syntax: 
        // while(condition) 
        //     { // code }
        System.out.println("\n\nWhile Loop:");
        int j = 1; // Initialization
        while (j <= 5) { // Condition
            System.out.print(j + " ");
            j++; // Increment
        }

        // 3. Do-While Loop 
        // Syntax: 
        // do 
        // { // code } 
        //     while(condition);
        System.out.println("\n\nDo-While Loop:");
        int k = 1; // Initialization
        do {
            System.out.print(k + " "); // Executes at least once before checking condition
            k++; // Increment
        } while (k <= 5); // Condition

        // 4. Enhanced For Loop (For-Each Loop) 
        // Syntax: 
        // for(dataType var : array) 
        // { // code }
        System.out.println("\n\nEnhanced For Loop:");
        int[] numbers = {1, 2, 3, 4, 5}; // Array
        for (int num : numbers) { // Iterates over each element
            System.out.print(num + " ");
        }

        // 5. Nested Loop (Example: Multiplication Table)
        System.out.println("\n\nNested Loop (Multiplication Table for 1 to 3):");
        for (int m = 1; m <= 3; m++) { // Outer loop
            for (int n = 1; n <= 3; n++) { // Inner loop
                System.out.print(m * n + " "); // Multiplication logic
            }
            System.out.println(); // Moves to the next line after inner loop
        }
    }
}
