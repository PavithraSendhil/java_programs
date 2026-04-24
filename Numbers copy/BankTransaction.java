package Numbers;
public class BankTransaction {


    public static void main(String[] args) {
        int[] accountBalances = {5000, 10000, 7500};

        try {
            int loanAmount = 15000;
            int numberOfInstallments = 0;
            int installmentPerMonth = loanAmount / numberOfInstallments;
            System.out.println("Installment per month: $" + installmentPerMonth);

            int requestedAccount = 4;
            System.out.println("Account balance: $" + accountBalances[requestedAccount]);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. Enter a valid number of installments.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid account number. Check the account list.");
        }

        System.out.println("Bank transaction process completed.");
    }
}

//import java.util.Scanner;
//
//public class ATMTransaction {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int balance = 5000;
//
//
//
//        try {
//
//            System.out.print("Enter amount to withdraw: ");
//
//            int amount = sc.nextInt();
//
//
//
//            if (amount > balance) {
//
//                throw new RuntimeException("Insufficient balance");
//
//            }
//
//
//
//            balance -= amount;
//
//            System.out.println("Withdrawal successful. Remaining balance: " + balance);
//
//
//
//        } catch (RuntimeException e) {
//
//            System.out.println("Error: " + e.getMessage());
//
//
//
//        } finally {
//
//            System.out.println("Transaction Completed");
//
//            sc.close();
//
//        }
//
//    }
//
//}