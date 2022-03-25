package com.example.cafesystem.Repository;

import com.example.cafesystem.MockData;
import com.example.cafesystem.Staff;
import com.example.cafesystem.ViewModels.StaffViewModel;
import com.example.cafesystem.ViewModels.UpdateStaffViewModel;

import java.util.ArrayList;
import java.util.UUID;

public class StaffRepository extends IStaffRepository{
    @Override
    public UUID createStaff(StaffViewModel staff) {
        ArrayList<Staff> all = MockData.getStaff();
        UUID newId = UUID.randomUUID();
        all.add(new Staff(newId, staff.getfName(), staff.getlName(),
                staff.getPassword(), staff.getAddress(), staff.portfolio, staff.getEmail()));

        return newId;
    }

    @Override
    public void updateStaff(UUID staffId, UpdateStaffViewModel staff) {

    }

    @Override
    public void deleteStaff(UUID staffId) {

    }

    @Override
    public Staff getStaffId(UUID staffId) {
        return null;
    }
}
