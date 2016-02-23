package com.task.manager.service;

import com.task.manager.model.Task;
import com.task.manager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Navkrishna on 21/10/15
 */
@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    public Task add(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> listAll() {
        return (List<Task>) taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return (Task) taskRepository.findOne(id);
    }

    public List<Task> getTaskByName(String name) {
        return taskRepository.findAllByName(name);
    }

}
