package com.example.cafesystem;

import com.example.cafesystem.ViewModels.Enum.Portfolio;

import java.util.UUID;

//Staff
//will be able to manage the process involved in delivering food
public class Staff extends  Person {

    private Portfolio portfolio;

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Staff(UUID id, String fName, String lName, String password, String address, Portfolio portfolio, String email) {
        super(fName, lName, password, address, email);
        setPortfolio(portfolio);
    }
}
