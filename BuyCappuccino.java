import java.text.DecimalFormat;
import java.util.Scanner;

class BuyCappuccino{

    String name;
    int age;
    double balance;

    BuyCappuccino(String name, int age, double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public void buyDrink() {
        Scanner scanner = new Scanner(System.in);

        double cashBack = balance * 0.05;
        double cappuccinoPrice = 6;

        System.out.println("Cappuccino is " + cappuccinoPrice + " Euro and you have " + balance + " Eruo, would you like to buy this: ");
        String answer = scanner.nextLine();
        

        if (answer.equals("yes")) {
            
            if (balance > cappuccinoPrice) {
                System.out.println("You bought the drink");
                balance -= cappuccinoPrice;

                DecimalFormat df = new DecimalFormat("0.00");
                String formattedCashBack = df.format(cashBack);
                
                
                System.out.println("You get " + formattedCashBack + " cent cashback!!");

                balance += cashBack;
                String formattedBalance = df.format(balance);

                System.out.println("Now your balance is: " + formattedBalance);
            }
            else {
                System.out.println("You do not have enough balance");
                return;
            }
        }
        else if (answer.equals("no")) {
            System.out.println("Okay, have a good day");
            return;
        }

        

    }


}