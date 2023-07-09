import java.util.Scanner;

public class SpyNumberProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ಸಂಖ್ಯೆಯನ್ನು ನಮೂದಿಸಿ: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        int product = 1;
        
        // Calculate the sum and product of the digits
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        
        // Check if the sum of digits equals the product of digits
        if (sum == product) {
            System.out.println("ಗುಪ್ತಸಂಖ್ಯೆಯಾಗಿದೆ!");
        } else {
            System.out.println("ಗುಪ್ತಸಂಖ್ಯೆಯಲ್ಲ!");
        }
    }
}
