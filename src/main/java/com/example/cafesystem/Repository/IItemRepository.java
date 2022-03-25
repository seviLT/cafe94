package com.example.cafesystem.Repository;

import com.example.cafesystem.Customer;
import com.example.cafesystem.ViewModels.CustomerViewModel;
import com.example.cafesystem.ViewModels.UpdateCustomerViewModel;

import java.util.UUID;

public abstract class IItemRepository {
    public abstract UUID createItem(CustomerViewModel item);
    public abstract void updateItem(UUID itemId, UpdateCustomerViewModel customer);
    public abstract void deleteItem(UUID itemId);
    public abstract Customer getItemId(UUID itemId);
}
