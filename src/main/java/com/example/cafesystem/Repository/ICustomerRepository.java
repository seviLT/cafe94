package com.example.cafesystem.Repository;

import com.example.cafesystem.Customer;
import com.example.cafesystem.ViewModels.CustomerViewModel;
import com.example.cafesystem.ViewModels.UpdateCustomerViewModel;

import java.util.UUID;

public interface ICustomerRepository {
    public UUID createCustomer(CustomerViewModel customer);
    public void updateCustomer(UUID customerId, UpdateCustomerViewModel customer);
    public void deleteCustomer(UUID customerId);
    public Customer getCustomerId(UUID customerId);
    public Customer getCustomerByEmailPassword(String email, String password);
}
