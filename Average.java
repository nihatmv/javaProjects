import java.text.DecimalFormat;
import java.util.Scanner;

public class Average {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        System.out.print("Write the numbers of elements that you want to find the average: ");
        double number = scanner.nextInt();
        
        
        for(int i = 0; i < number; i++) {
            System.out.print("Write the element " + (i + 1) + ": ");
            double x = scanner.nextDouble();
            sum += x;
        }
        
        System.out.println("The average of numbers is: " + findAverage(number, sum));
    }


    public static String findAverage(double number, double sum) {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        
        double average = sum / number;
        
        return df.format(average);
    }

}