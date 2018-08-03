package com.ivan.demo.service;

import com.ivan.demo.model.User;
import com.ivan.demo.repository.UserRepository;
import com.ivan.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    public User delete(int id) {
        User user = findById(id);
        if(user != null){
            repository.delete(user);
        }
        return user;
    }

    @Override
    public List<User> findAll() {
        List<User> users = repository.findAll();
        return repository.findAll();
    }

    @Override
    public User findById(int id) {
        return repository.findById(id);
    }

    @Override
    public User update(User user) {
        return repository.save(user);
    }
}