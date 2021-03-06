package com.ivan.demo.controller;


import com.ivan.demo.model.Task;
import com.ivan.demo.model.User;
import com.ivan.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> listTasks(){
        List<Task> tasks = this.taskService.findAll();
        tasks.stream()
                .forEach(System.out::println);
        return this.taskService.findAll();
    }

    @PostMapping("/save")
    public Task  saveTask(@RequestBody Task task ){
        System.out.println("----------------------------------");
        System.out.println("-------------save------------------");
        System.out.println("Task: " + task.toString());
        return this.taskService.save(task);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Task task) {
        System.out.println("----------------------------------");
        System.out.println("---------------delete-------------------");
        System.out.println("Task: " + task.toString());
        taskService.delete(task);
    }

}
