package com.hecam.ticketing.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int size;
    private Timestamp createdDate;
    private Timestamp updateDate;

    // Relations
    @OneToOne
    @JoinColumn(name = "head_id")
    private Employee manager;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}
