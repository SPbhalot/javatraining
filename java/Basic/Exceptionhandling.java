package Basic;

import java.util.Scanner;

public class Exceptionhandling{
public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
   //try,catch,finally,throws,throw
   while(true){
    try{
       
            int n1=sc.nextInt();
            int n2=sc.nextInt(); 
            System.out.println(n1 + " " + n2+" "+n1/n2);
            break;
            }catch(ArithmeticException ex){
                System.out.println(ex);
            }
    }
   sc.close();
}
}