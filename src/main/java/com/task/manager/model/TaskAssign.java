package com.task.manager.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by bharatghimire on 21/10/15.
 */

@Entity
@Table(name = "TASK_ASSIGN")
public class TaskAssign {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "task_assign_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Date getDateAssigned() {
        return dateAssigned;
    }

    public void setDateAssigned(Date dateAssigned) {
        this.dateAssigned = dateAssigned;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "date_assigned")
    private Date dateAssigned;
}
