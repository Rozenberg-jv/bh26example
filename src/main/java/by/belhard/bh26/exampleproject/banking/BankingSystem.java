package by.belhard.bh26.exampleproject.banking;

import by.belhard.bh26.exampleproject.banking.io.Command;
import by.belhard.bh26.exampleproject.banking.io.IOInterface;
import by.belhard.bh26.exampleproject.banking.model.Account;
import by.belhard.bh26.exampleproject.banking.service.AccountService;
import by.belhard.bh26.exampleproject.banking.service.TransactionService;

import java.io.IOException;

import static by.belhard.bh26.exampleproject.banking.io.Command.*;

public class BankingSystem {

    private IOInterface ioInterface;
    private AccountService accountService;
    private TransactionService transactionService;

    public void start() {

        String input = "";
        Command command;
        Account currentAccount = null;

        // infinite loop
        do {
            // login
            while (currentAccount == null) {
                currentAccount = accountService.login();
            }

            // internal work
            mainProcess(currentAccount);

            currentAccount = null;
        } while (true);
    }

    private void mainProcess(final Account currentAccount) {

        String input = "";
        Command command = null;

        do {
            System.out.println(MENU_LEGEND);

            try {
                input = ioInterface.readLine();
            } catch (IOException e) {
                System.err.println(e.getMessage());
                input = "";
            }

            switch (input) {
                case CHECK_BALANCE_VALUE:
                    command = new CheckBalanceCommand(currentAccount);
                    break;
                case WITHDRAW_MONEY_VALUE:
                    command = new WithdrawMoneyCommand(currentAccount);
                    break;
                case PUT_MONEY_VALUE:
                    command = new PutMoneyCommand();
                    break;
                case MAKE_TRANSACTION_VALUE:
                    command = new MakeTransactionCommand();
                    break;
                case EXIT_VALUE:
                    command = new ExitCommand();
                    break;
                default:
                    command = new DoNothingCommand();
                    break;
            }

            command.execute();

        } while (!EXIT_VALUE.equals(input));
    }

}