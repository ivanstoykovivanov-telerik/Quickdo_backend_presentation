package com.ivan.demo.repository;

import com.ivan.demo.model.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Long> {

    List<Task> findAll();

    Task save(Task task);

    void delete(Task task) ;

}
