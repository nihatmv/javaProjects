import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){ 
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the seconds:");
        double second = scanner.nextInt();
        double hour = second / 3600;
        double minute = second / 60;
        System.out.println(second + " second is equal to " + String.format("%.2f",hour) + " hour");
        System.out.println(second + " second is equal to " + String.format("%.2f",minute) + " minute");


    }
}   