package com.task.manager.controller;

import com.task.manager.model.Task;
import com.task.manager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Navkrishna on 21/10/15
 */
@RestController
@RequestMapping(name = "/task")
public class TaskController {

    @Autowired
    TaskService taskService;

    @RequestMapping(name = "/create", method = RequestMethod.POST)
    public Task createTask(@RequestBody Task task) {
        return taskService.add(task);
    }

    @RequestMapping(name = "/listAll", method = RequestMethod.GET)
    public List<Task> listAll() {
        return taskService.listAll();
    }

    @RequestMapping(name = "/listAllByName", method = RequestMethod.GET)
    public List<Task> listAllByName(String name) {
        return taskService.getTaskByName(name);
    }

}
