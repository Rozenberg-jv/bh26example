package by.belhard.bh26.exampleproject.banking.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Account {
    private int id;
    private String username;
    private String password;
    private int money;

    public boolean checkPassword(String another) {

        return password.equals(another);
    }
}
