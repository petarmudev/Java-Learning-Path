package L13_DefiningClasses.Task03_BankAccount;

import javax.print.DocFlavor;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Integer, BankAccount> accounts = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] inputData = input.split("\\s+");
            String command = inputData[0];
            String result = "";

            int accountID;
            BankAccount currentAccount;
            switch (command) {
                case "Create":      //"Create"
                    BankAccount bankAccount = new BankAccount();
                    result = String.format("Account ID%d created", bankAccount.getId());
                    accounts.put(bankAccount.getId(), bankAccount);
                    break;
                case "Deposit":     //"Deposit 1 20"
                    accountID = Integer.parseInt(inputData[1]);
                    double depositMoney = Double.parseDouble(inputData[2]);
                    if (accounts.containsKey(accountID)) {
                        currentAccount = accounts.get(accountID);
                        currentAccount.deposit(depositMoney);
                        accounts.put(accountID, currentAccount);
                        result = String.format("Deposited %.0f to ID%d", depositMoney, accountID);
                    } else {
                        result = String.format("Account does not exist");
                        break;
                    }
                    break;
                case "SetInterest":     //"SetInterest 1.5"
                    double interest = Double.parseDouble(inputData[1]);
                    BankAccount.setInterestRate(interest);
                    break;
                case "GetInterest":     //"GetInterest 2 1"
                    accountID = Integer.parseInt(inputData[1]);
                    int years = Integer.parseInt(inputData[2]);
                    if (accounts.containsKey(accountID)) {
                        currentAccount = accounts.get(accountID);
                        result = String.format("%.2f", currentAccount.getInterestRate(years));
                    } else {
                        result = String.format("Account does not exist");
                        break;
                    }
                    break;
                case "End":
                    break;
                default:
                    break;
            }

            if (!result.isEmpty()) {
                System.out.println(result);
            }
            input = scanner.nextLine();
        }
    }
}


