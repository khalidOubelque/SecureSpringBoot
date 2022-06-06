package com.example.repository;

import com.example.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeRepo extends JpaRepository<Employe,Long> {
}
