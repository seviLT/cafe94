package com.example.cafesystem.Repository;


import com.example.cafesystem.Customer;
import com.example.cafesystem.MockData;
import com.example.cafesystem.ViewModels.CustomerViewModel;
import com.example.cafesystem.ViewModels.UpdateCustomerViewModel;

import java.util.ArrayList;
import java.util.UUID;

public class CustomerRepository implements ICustomerRepository{
    @Override
    public UUID createCustomer(CustomerViewModel customer) {
        ArrayList<Customer> all = MockData.getCustomers();
        UUID newId = UUID.randomUUID();
        all.add(new Customer(newId, customer.fName, customer.lName,
                customer.password, customer.address, customer.email));

        return newId;
    }

    @Override
    public void updateCustomer(UUID customerId, UpdateCustomerViewModel customerViewModel) {
        ArrayList<Customer> all = MockData.getCustomers();
        Customer customer =  getCustomerId(customerId);

        int index = all.indexOf(customer);
        customer.setAddress(customerViewModel.address);
        customer.setPassword(customerViewModel.password);
        customer.setfName(customerViewModel.fName);
        customer.setlName(customerViewModel.lName);

        all.set(index, customer);

        return;
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        ArrayList<Customer> all = MockData.getCustomers();
        all.removeIf(x -> x.getId() == customerId);

        return;
    }

    @Override
    public Customer getCustomerId(UUID customerId) {
        ArrayList<Customer> all = MockData.getCustomers();

        return all.stream().filter(x -> x.getId() == customerId).findAny().orElse(null);
    }

    @Override
    public Customer getCustomerByEmailPassword(String email, String password) {
        ArrayList<Customer> all = MockData.getCustomers();

        return all.stream().filter(x -> x.getEmail() == email && x.getPassword() == password).findAny().orElse(null);    }
}
