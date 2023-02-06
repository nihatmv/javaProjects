import java.util.Arrays;
import java.util.Scanner;

public class java_test{

    public static void main(String[] args) { 
        String convertTo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your dollar value: ");
        int dollar = scanner.nextInt();

        

            double manat = dollar * 1.69;
            System.out.println(dollar + " dollar is " + manat +" manat");    
        

    }
}   




// import java.util.Scanner;

// class java_test {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         double amount;
//         String sourceCurrency, targetCurrency;
//         double USD_TO_EUR = 0.86;
//         double EUR_TO_USD = 1.16;

//         System.out.print("Enter the amount to convert: ");
//         amount = scanner.nextDouble();
//         scanner.nextLine(); // to consume the new line character

//         System.out.print("Enter the source currency (USD or EUR): ");
//         sourceCurrency = scanner.nextLine();

//         System.out.print("Enter the target currency (USD or EUR): ");
//         targetCurrency = scanner.nextLine();

//         if (sourceCurrency.equalsIgnoreCase("USD") && targetCurrency.equalsIgnoreCase("EUR")) {
//             amount = amount * USD_TO_EUR;
//         } else if (sourceCurrency.equalsIgnoreCase("EUR") && targetCurrency.equalsIgnoreCase("USD")) {
//             amount = amount * EUR_TO_USD;
//         } else {
//             System.out.println("Invalid currency input. Only USD and EUR are supported.");
//             return;
//         }

//         System.out.println("The converted amount is: " + amount + " " + targetCurrency);
//     }
// }




