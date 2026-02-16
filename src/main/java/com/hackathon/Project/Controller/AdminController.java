package com.hackathon.Project.Controller;

import com.hackathon.Project.Entity.Admin;
import com.hackathon.Project.Service.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admins")
public class AdminController {

    private final AdminService service;

    public AdminController(AdminService service) {
        this.service = service;
    }

    @PostMapping
    public Admin create(@RequestBody Admin admin) {
        return service.save(admin);
    }

    @GetMapping
    public List<Admin> getAll() {
        return service.getAll();
    }
}