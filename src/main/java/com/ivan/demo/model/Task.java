package com.ivan.demo.model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column
    private String name;
    @Column
    private LocalDate dueDate;
    @Column
    private Boolean completed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dueDate=" + dueDate +
                ", completed=" + completed +
                '}';
    }
}
