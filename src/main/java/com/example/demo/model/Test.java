package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Test {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private LocalDate date;
}
