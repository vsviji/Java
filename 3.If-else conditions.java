import java.util.*;


public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();//give the input here
        
        scanner.close();
        if(N%2 == 0)
        {
            if(N>=2 && N<=5)
            {
                System.out.println("Not Weird");
            }
            else if(N>=6 && N<=20)
            {
                System.out.println("Weird");
            }
            else
            {
                System.out.println("Not Weird");
            } 
        }
        else
        {
            System.out.println("Weird");
        }
    }
}
