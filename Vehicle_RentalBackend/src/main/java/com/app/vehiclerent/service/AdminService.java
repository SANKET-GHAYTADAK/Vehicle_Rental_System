package com.app.vehiclerent.service;

import java.util.List;

import com.app.vehiclerent.entity.Admin;

public interface AdminService {
    List<Admin> getAllAdmins();

    Admin getAdminById(Long id);

    Admin createAdmin(Admin admin);

    Admin updateAdmin(Long id, Admin admin);

    void deleteAdmin(Long id);
}
