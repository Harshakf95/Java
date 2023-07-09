import java.util.Scanner;
class menudriven 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        do 
        {
            System.out.println("==== MENU ====");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.println("You selected Option 1.");
                    break;
                case 2:
                    System.out.println("You selected Option 2.");
                    break;
                case 3:
                    System.out.println("You selected Option 3.");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while(choice != 4);
        scanner.close();
    }
}