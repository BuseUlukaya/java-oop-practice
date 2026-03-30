import java.util.Scanner;
import java.util.Random;
public class Randomnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int  right = 5;
        int guess_number = random.nextInt(100);
        
        while(right > 0) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println("Number: " + number);

            if(number > guess_number) {
                System.out.println("Please enter more small number");
                right -= -1;
            }
            else if (number < guess_number) {
                System.out.println("Please enter more big number");
                right -= -1;
            }
            else {
                System.out.println("Correct");
            }

            if(right == 0) {
                System.out.println("Your rights are finished");
            }
        }
    }

}