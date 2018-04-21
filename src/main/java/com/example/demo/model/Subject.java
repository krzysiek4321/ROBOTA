package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "subject")
    private Set<Test> tests=new HashSet<>();
    @JsonIgnore
    @ManyToOne
    private Course course;
}
