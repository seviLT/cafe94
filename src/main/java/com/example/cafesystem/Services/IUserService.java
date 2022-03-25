package com.example.cafesystem.Services;

public abstract class IUserService {
    public abstract boolean customerLogin(String email, String password);
    public abstract boolean adminLogin(String email, String password);
    public abstract boolean create(String fName, String lName, String email);
    public abstract boolean deleteCustomer(String email);
    public abstract boolean deleteStaff(String email);
}
