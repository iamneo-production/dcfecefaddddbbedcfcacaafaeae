package com.examly.springapp.controller;


import com.examly.springapp.repository.*;
import com.examly.springapp.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/")
public class TaskController {

    @Autowired
    TaskRepository taskRepository;


    @PostMapping("/saveTask")
    public ResponseEntity<?> saveTask(@RequestBody Task task){
        return new ResponseEntity<>(taskRepository.save(task), HttpStatus.ACCEPTED);
    }

    @GetMapping("/allTasks")
    public ResponseEntity<?> allTasks(){
        return new ResponseEntity<>(taskRepository.findAll(),HttpStatus.ACCEPTED);
    }
