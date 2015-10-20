package com.task.manager.service;

import com.task.manager.model.Task;
import com.task.manager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Object listAll() {
        return taskRepository.findAll();
    }

    public Object getTaskById(Long id) {
        return taskRepository.findOne(id);
    }

}
