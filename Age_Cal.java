import java.util.Scanner;
public class Age_Cal 
{
    public static void main(String[] args) 
    {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your birth year:");
            int birthYear = scanner.nextInt();
            int age = 2023 - birthYear;
            System.out.println("You are " + age + " years old.");
        }
    }
}