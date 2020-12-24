package by.belhard.bh26.exampleproject.banking.io;

import by.belhard.bh26.exampleproject.banking.model.Account;

public interface Command {

    String EXIT_VALUE = "e";
    String CHECK_BALANCE_VALUE = "1";
    String WITHDRAW_MONEY_VALUE = "2";
    String PUT_MONEY_VALUE = "3";
    String MAKE_TRANSACTION_VALUE = "4";

    String EXIT_MESSAGE = "Exit";
    String CHECK_BALANCE_MESSAGE = "Check account balance";
    String WITHDRAW_MONEY_MESSAGE = "Withdraw money from account";
    String PUT_MONEY_MESSAGE = "Put money in account";
    String MAKE_TRANSACTION_MESSAGE = "Go to transactions menu";

    String MENU_LEGEND = String.format(
            "\t[%s]\t%s\n" +
                    "\t[%s]\t%s\n" +
                    "\t[%s]\t%s\n" +
                    "\t[%s]\t%s\n" +
                    "\t[%s]\t%s\n",
            CHECK_BALANCE_VALUE, CHECK_BALANCE_MESSAGE,
            WITHDRAW_MONEY_VALUE, WITHDRAW_MONEY_MESSAGE,
            PUT_MONEY_VALUE, PUT_MONEY_MESSAGE,
            MAKE_TRANSACTION_VALUE, MAKE_TRANSACTION_MESSAGE,
            EXIT_VALUE, EXIT_MESSAGE
    );

    void execute();
}
