import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to display: ");
        int n = scanner.nextInt();
        
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first +seecond;
            first = second;
            second = next;
        }
        
        scanner.close();
    }
}
//op
//Enter the number of Fibonacci numbers to dispalay:5
//0 1 1 2 3
