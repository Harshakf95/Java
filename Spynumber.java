import java.util.Scanner;
public class Spynumber 
{
    public static void main(String[] args)
    {
        int num,prod=1,sum=0,ld;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number to check: ");
            num=sc.nextInt();
        }
        while(num>0)
        {
            ld=num%10;
            sum+=ld;
            prod*=ld;
            num/=10;
        }
        if(prod==sum)
            System.out.print("Given number is a spy number");
        else
            System.out.print("Given number is not a spy number");
    }
}
