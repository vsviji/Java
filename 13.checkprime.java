import java.io.*;
import java.util.Scanner;
class prime {
    public static void main(String[] args) {
        int i,m=0,flag=0;
        //int n=3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        m=n/2;
        if(n==0||n==1)
        {
            System.out.println(n+"is not a prime");
        }
        else
        {
            for(i=2;i<=m;i++)
            {
                if(n%i==0){
                    flag=1;
                    System.out.println(n+"is not a prime");
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(n+" is a prime");
            }
        }
        
        
    }
}
