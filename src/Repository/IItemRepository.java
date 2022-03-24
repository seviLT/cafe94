package src.Repository;

import src.Customer;
import src.ViewModels.CustomerViewModel;
import src.ViewModels.UpdateCustomerViewModel;

import java.util.UUID;

public interface IItemRepository {
    public UUID createItem(CustomerViewModel item);
    public void updateItem(UUID itemId, UpdateCustomerViewModel customer);
    public void deleteItem(UUID itemId);
    public Customer getItemId(UUID itemId);
}
