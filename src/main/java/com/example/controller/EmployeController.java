package com.example.controller;

import com.example.entity.Employe;
import com.example.repository.IEmployeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/employe")
public class EmployeController {

    @Autowired
    IEmployeRepo employeRepo;

    @GetMapping("/message")
    public String getMessage(){
        return "Hello world";
    }

    @GetMapping("/employees")
    public Iterable<Employe> getEmployees(){
        return employeRepo.findAll();
    }

    @PostMapping
    public Employe createEmploye(@RequestBody Employe employe){
        return employeRepo.save(employe);
    }

    @GetMapping("/{employeeId}")
    public Employe getEmploye(@PathVariable Long employeId){
        return employeRepo.findById(employeId).orElseThrow(RuntimeException::new);
    }

    @DeleteMapping
    public void deleteEmploye(@PathVariable Long employeId){
        employeRepo.deleteById(employeId);
    }
}
