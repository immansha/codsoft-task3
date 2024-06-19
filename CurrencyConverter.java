import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        // Hardcoded exchange rates (for simplicity)
        double usdToEurRate = 0.88;
        double usdToGbpRate = 0.78;

        // Taking user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in USD to convert: ");
        double amountUSD = scanner.nextDouble();

        // Converting to EUR, GBP,
        double amountEUR = amountUSD * usdToEurRate;
        double amountGBP = amountUSD * usdToGbpRate;

        // Displaying results
        System.out.printf("%.2f USD is %.2f EUR", amountUSD, amountEUR);
        System.out.printf("%.2f USD is %.2f GBP", amountUSD, amountGBP);

        scanner.close();
    }
}
