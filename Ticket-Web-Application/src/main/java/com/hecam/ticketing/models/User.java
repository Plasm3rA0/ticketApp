package com.hecam.ticketing.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private Timestamp creationDate;
    private Timestamp updateDate;

    // Relations

    @OneToMany(mappedBy = "user")
    private List<Ticket> tickets;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;


}
