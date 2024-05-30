package com.hecam.ticketing.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@Entity
public class Employee {
    @Id
    private String dni;
    private String name;
    private String surname;
    private Date dateOfBirth;
    private String username;
    private String password;
    private Timestamp creationDate;
    private Timestamp updateDate;

    // Relations
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @OneToMany(mappedBy = "employee")
    private List<Ticket> tickets;
}
