package com.hackathon.Project.Service;

import com.hackathon.Project.Entity.Admin;
import com.hackathon.Project.Repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    private final AdminRepository repo;

    public AdminService(AdminRepository repo) {
        this.repo = repo;
    }

    public Admin save(Admin admin) {
        return repo.save(admin);
    }

    public List<Admin> getAll() {
        return repo.findAll();
    }
}