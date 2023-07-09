import java.util.Scanner;
public class Age_Cal 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year:");
        int birthYear = input.nextInt();
        int age = 2023 - birthYear;
        System.out.println("You are " + age + " years old.");
    }
}