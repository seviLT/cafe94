package com.example.cafesystem.Services;

public interface IUserService {
    public boolean customerLogin(String email, String password);
    public boolean adminLogin(String email, String password);
    public boolean create(String fName, String lName, String email);
    public boolean deleteCustomer(String email);
    public boolean deleteStaff(String email);
}
