import java.util.Random;
import java.util.Scanner;


public class GuessGame{

    public static void main(String[] args){
        int choices = 0;

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the upperbound of number list: ");
        int upperbound = scanner.nextInt();
        
        
        
        int int_random = rand.nextInt(upperbound);

        while (true) {
            System.out.println("Write an integer between 0 and " + upperbound);
            int number = scanner.nextInt();

            if (number != int_random) {

                if (int_random > number) {
                    System.out.println("Higher..");
                    choices++;
                }
                else {
                    System.out.println("Lower..");
                    choices++;
                }           
            }

            else{
                choices++;
                System.out.println("You find the number in " + choices + " times");
                break;
            }
        }
    }
}