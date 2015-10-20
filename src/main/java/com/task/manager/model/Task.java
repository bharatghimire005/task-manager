package com.task.manager.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Navkrishna on 20/10/15
 */
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "last_updated")
    private Date lastUpdated;

    @Column(name = "created_by")
    private Long createdBy;


}
