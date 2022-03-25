package com.example.cafesystem.Repository;


import com.example.cafesystem.Staff;
import com.example.cafesystem.ViewModels.StaffViewModel;
import com.example.cafesystem.ViewModels.UpdateStaffViewModel;

import java.util.UUID;

public interface IStaffRepository {
    public UUID createStaff(StaffViewModel staff);
    public void updateStaff(UUID staffId, UpdateStaffViewModel staff);
    public void deleteStaff(UUID staffId);
    public Staff getStaffId(UUID staffId);
}
