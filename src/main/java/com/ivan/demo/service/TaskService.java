package com.ivan.demo.service;

import com.ivan.demo.model.Task;

import java.util.List;

public interface TaskService {

    List<Task> findAll();

    Task saveTask(Task task);

}
