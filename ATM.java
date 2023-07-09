import java.util.Scanner;
public class ATM 
{
    public static void main(String[] args) 
    {
        int bal=100000,withdraw,deposit;
        Scanner sc=new Scanner(System.in);
        while (true) 
        {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for withdraw");
            System.out.println("Choose 2 for deposit");
            System.out.println("Choose 3 for check balance");
            System.out.println("Choose 4 for exit");
            System.out.print("Choose the operator you want to perform: ");
            int choice=sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter money to withdraw: ");
                    withdraw=sc.nextInt();
                    if (bal>=withdraw) 
                    {
                        bal-=withdraw;
                        System.out.println("Please collect your money");    
                    } else 
                    {
                        System.out.println("Insufficient balance");   
                    }
                    break;
                case 2:
                    System.out.print("Enter number to be depositd: ");
                    deposit=sc.nextInt();
                    bal+=deposit;
                    System.out.println("Your money has been successfully deposited");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Balance: "+bal);
                    System.out.println(" ");
                    break;
                case 4:
                    System.exit(0);
                    break;
            }    
        }    
    }    
}
