package com.example.cafesystem.Repository;


import com.example.cafesystem.Staff;
import com.example.cafesystem.ViewModels.StaffViewModel;
import com.example.cafesystem.ViewModels.UpdateStaffViewModel;

import java.util.UUID;

public abstract class IStaffRepository {
    public abstract UUID createStaff(StaffViewModel staff);
    public abstract void updateStaff(UUID staffId, UpdateStaffViewModel staff);
    public abstract void deleteStaff(UUID staffId);
    public abstract Staff getStaffId(UUID staffId);
}
