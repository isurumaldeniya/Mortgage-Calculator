import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //creating new scanner to get input from terminal

        //getting inputs
        System.out.print("Principle: ");
        double principle = scanner.nextDouble();

        System.out.print("Annual Interest Rate: ");
        double interestRate = scanner.nextDouble();

        System.out.print("Period (Years): ");
        double period = scanner.nextDouble();

        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;

        double monthlyInterest = (interestRate/PERCENT)/MONTHS_IN_YEAR; //calculating monthly interest from interest rate

        double totalPeriod = period * 12;

        double newNum = Math.pow(1+monthlyInterest, totalPeriod);

        double Mortgage = principle * ((monthlyInterest * newNum) / (newNum - 1)); //calculating Mortgage


        NumberFormat price = NumberFormat.getCurrencyInstance(); //from java.text package
        String result = price.format(Mortgage); //formatting mortgage to currency
        System.out.println("Mortgage: " + result);
    }
}
