package src.ViewModels;

import src.Person;
import src.ViewModels.Enum.Portfolio;

import java.util.UUID;

public class StaffViewModel extends Person {
    public Portfolio portfolio;

    public StaffViewModel(UUID id, String fName, String lName, String password, String address, Portfolio portfolio, String email) {
        super(fName, lName, password, address, email);
        this.portfolio = portfolio;
    }
}
