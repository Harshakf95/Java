import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class Calculator 
{
    public static void main(String[] args) 
    {
        float a,b,res;
        int choice;
        Scanner scan=new Scanner(System.in);
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.print("Enter your choice(1-4): ");
        choice=scan.nextInt();
        if(choice>=1&&choice<=4)
        {
            System.out.println("Enter any two numbers ");
            a=scan.nextFloat();
            b=scan.nextFloat();
            if(choice==1)
            res=a+b;
            else if(choice==2)
            res=a-b;
            else if(choice==3)
            res=a*b;
            else 
            res=a/b;
            System.out.println("Result="+res);
        }
        else
        System.out.println("Invalid choice!");
    }    
}
