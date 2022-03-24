package src.Repository;

import src.Staff;
import src.ViewModels.StaffViewModel;
import src.ViewModels.UpdateStaffViewModel;

import java.util.UUID;

public interface IStaffRepository {
    public UUID createStaff(StaffViewModel staff);
    public void updateStaff(UUID staffId, UpdateStaffViewModel staff);
    public void deleteStaff(UUID staffId);
    public Staff getStaffId(UUID staffId);
}
