package com.task.manager.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by bharatghimire on 20/10/15.
 */
@Entity
@Table(name = "task_status")
public class TaskStatus {

    @Id
    @Column(name = "task_status_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;


    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;


    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    @Column(name = "date_updated")
    private Date dateUpdated;
}
