package com.example.demo.properties;

import jakarta.persistence.*;

import java.util.Date;

@Entity @Table(name = "Emsi_Student")
@lombok.Data
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom_student",length = 30)
    private String name;
    @Temporal(TemporalType.DATE)
    private Date dataN;
}
