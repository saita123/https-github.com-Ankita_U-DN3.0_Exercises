import java.util.Scanner;

public class Main {

    // Method to calculate future value recursively
    public static double calculateFutureValue(double principal, double rate, int years) {
        // Base case
        if (years == 0) {
            return principal;
        }
        // Recursive case: calculate the future value for the remaining years
        double futureValue = calculateFutureValue(principal, rate, years - 1);
        return futureValue * (1 + rate);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Financial Forecasting Tool");
            System.out.println("1. Calculate Future Value");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the initial principal amount: ");
                    double principal = scanner.nextDouble();

                    System.out.print("Enter the annual growth rate (as a decimal): ");
                    double rate = scanner.nextDouble();

                    System.out.print("Enter the number of years: ");
                    int years = scanner.nextInt();

                    double futureValue = calculateFutureValue(principal, rate, years);
                    System.out.printf("The future value after %d years is: %.2f%n", years, futureValue);
                    break;
                case 2:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
