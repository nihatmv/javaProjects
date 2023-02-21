import java.util.Arrays;
import java.util.Scanner;


public class BigNumber{

    public static void main(String[] args) { 
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter a number between 1 and 100: ");
        int num1 = scn.nextInt();

        System.out.println("Enter another number between 1 and 100: ");
        int num2 = scn.nextInt();
        
        if ((num1 > 100) || (num1 < 0) || (num2 > 100) || (num2 < 0)) {
            System.out.println("You do not write correctly!");
            return;
        }

        int result = compareNumbers(num1, num2);
        System.out.println("You entered " + num1 + " and " + num2 + " and the bigger one is: " + result);
    }

    public static int compareNumbers(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        else {
            return num2;
        }
    }

    
}

