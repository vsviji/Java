import java.io.*;
import java.util.*;
class datatypes{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int st=sc.nextLine();
    for(int i=0;i<t;i++){
      try
        {
          long x=sc.nextLong();
          System.out.println(x+"can be fitted in");
          if(x>=127&&x<=127)
            System.out.println("*byte");
          else
          { 
            if(x>= -32768 && x <= 32767)
              {
                System.out.println("* short");
              }
          if(x>=-2147483648 && x<=2147483647)
              {
                System.out.println("* int");
              }
          if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)
             {
              System.out.println("* long");
             }
          }
        }
      catch(Exception e)
        {
          System.out.println(sc.next()+"cannot be fitted in anywhere");
        }
    }
  }
}
