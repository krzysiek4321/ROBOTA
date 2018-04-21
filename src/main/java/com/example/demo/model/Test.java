package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.File;
import java.time.LocalDate;

@Entity
@Table(name = "Tests")
public class Test {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private LocalDate date;
    private File exampleTest;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "name")
    private Subject subject;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public File getExampleTest() {
        return exampleTest;
    }

    public void setExampleTest(File exampleTest) {
        this.exampleTest = exampleTest;
    }
}
