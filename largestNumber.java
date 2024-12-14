package HW_Day4;
import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();
        
        System.out.print("Enter fourth number: ");
        int number4 = scanner.nextInt();
        
        int largest = number1;
        
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }
        if (number4 > largest) {
            largest = number4;
        }
        System.out.println("The largest number among the four is: " + largest);
        scanner.close();
    }
}

