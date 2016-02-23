package com.task.manager.controller;

import com.task.manager.model.Task;
import com.task.manager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by Navkrishna on 21/10/15
 */
@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    TaskService taskService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Task createTask(@RequestBody Task task) {
        Date today = new Date();
        task.setDateCreated(""+today);
        task.setLastUpdated(""+today);
        return taskService.add(task);
    }

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public List<Task> listAll() {
        return taskService.listAll();
    }

    @RequestMapping(value = "/listAllByName", method = RequestMethod.GET)
    public List<Task> listAllByName(String name) {
        return taskService.getTaskByName(name);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public Task findById(Long id) {
        return taskService.getTaskById(id);
    }

}
