import java.util.Scanner;

//import javax.lang.model.util.ElementScanner14;
public class Temp 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1.Fahrenheit to Celcius");
            System.out.println("2.Celcius to Fahrenheit"); 
            System.out.print("Enter your choice(1 or 2): ");
            int choice=sc.nextInt();
            if(choice==1)
            {
                System.out.println("Enter the temperature in Fahrenheit: ");
                double Fahrenheit=sc.nextDouble();
                double Celcius=(Fahrenheit-32)*5/9;
                System.out.print("Temperature in Celcius: "+Celcius);
            }
            else if(choice==2)
            {
                System.out.print("Enter the temperature in celcius: ");
                double Celcius=sc.nextDouble();
                double Fahrenheit=(Celcius*9/5)+32;
                System.out.println("Temperature in Fahrenheit: "+Fahrenheit);
            }
            else 
            {
                System.out.println("Invalid choice! please enter 1 or 2");
            }
        }
    }
}
