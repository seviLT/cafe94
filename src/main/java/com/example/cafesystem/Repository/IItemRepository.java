package com.example.cafesystem.Repository;

import com.example.cafesystem.Customer;
import com.example.cafesystem.ViewModels.CustomerViewModel;
import com.example.cafesystem.ViewModels.UpdateCustomerViewModel;

import java.util.UUID;

public interface IItemRepository {
    public UUID createItem(CustomerViewModel item);
    public void updateItem(UUID itemId, UpdateCustomerViewModel customer);
    public void deleteItem(UUID itemId);
    public Customer getItemId(UUID itemId);
}
