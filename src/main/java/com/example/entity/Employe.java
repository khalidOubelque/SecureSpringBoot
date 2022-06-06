package com.example.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Employe {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "REGISTRATIONNUMBER")
    private String registrationNumber;

}
