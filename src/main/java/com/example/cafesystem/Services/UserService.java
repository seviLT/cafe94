package com.example.cafesystem.Services;

import com.example.cafesystem.Customer;
import com.example.cafesystem.Repository.ICustomerRepository;
import com.example.cafesystem.Repository.IStaffRepository;

public class UserService extends IUserService {
    private ICustomerRepository _customerRepository;
    private IStaffRepository _staffRepository;
    public UserService(ICustomerRepository customerRepository,
                       IStaffRepository staffRepository){
        _customerRepository = customerRepository;
        _staffRepository = staffRepository;
    }
    @Override
    public boolean customerLogin(String email, String password) {
        Customer customer = _customerRepository.getCustomerByEmailPassword(email, password);

        if(customer == null){
            return false;
        }
        return true;
    }

    @Override
    public boolean adminLogin(String email, String password) {
        return false;
    }

    @Override
    public boolean create(String fName, String lName, String email) {
        return true;
    }

    @Override
    public boolean deleteCustomer(String email) {
        return false;
    }

    @Override
    public boolean deleteStaff(String email) {
        return false;
    }
}
