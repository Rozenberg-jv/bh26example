package by.belhard.bh26.exampleproject.banking.io;

import java.io.IOException;

public interface IOInterface {

    String readLine() throws IOException;

    int readIntValue() throws IOException, NumberFormatException;
}
