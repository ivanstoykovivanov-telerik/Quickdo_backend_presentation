package com.ivan.demo.service;

import com.ivan.demo.model.Task;
import com.ivan.demo.repository.TaskRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;


    @Override
    public List<Task> findAll() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }

    @Override
    public void delete(Task task) {
        System.out.println("**********delete**************");
        System.out.println(task);
        System.out.println("************************");
        this.taskRepository.delete(task);
    }


}
