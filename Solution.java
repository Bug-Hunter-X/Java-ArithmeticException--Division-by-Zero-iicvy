public class MyClass {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        try {
            y = 5 / x; 
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }
        System.out.println(y); // Output will be 0 after exception handling
    }
}