import java.util.Scanner;
public class Program2 
{
    public static void main(String[] args)
    {
        int a,b,c;
        int choice;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 to Quit\n \n ");
            System.out.println("Make your choice");
            choice = scanner.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.println("Enter the first number ");
                    a = scanner.nextInt();
                    System.out.println("Enter the second number");
                    b = scanner.nextInt();
                    c = a + b;
                    System.out.println("The sum of the numbers is = " + c +"\n");
                break;
                case 2:
                    System.out.println("Enter the first number ");
                    a = scanner.nextInt();
                    System.out.println("Enter the second number");
                    b = scanner.nextInt();
                    c = a - b;
                    System.out.println("The difference of the numbers is = " + c +"\n");
                break;
                case 3:
                    System.out.println("Enter the first number");
                    a = scanner.nextInt();
                    System.out.println("Enter the second number");
                    b = scanner.nextInt();
                    c = a * b;
                    System.out.println("The product of the numbers is = " + c + "\n");
                break;
                case 4:
                    System.out.println("Enter the first number");
                    a = scanner.nextInt();
                    System.out.println("Enter the second number");
                    b = scanner.nextInt();
                    c = a / b;
                    System.out.println("The quotient is = " + c +"\n");
                break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!!! Please make a valid choice. \\n\\n");
            }
        }
    }
}