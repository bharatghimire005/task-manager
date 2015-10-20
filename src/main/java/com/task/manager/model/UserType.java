package com.task.manager.model;

import javax.persistence.*;

/**
 * Created by Navkrishna on 21/10/15
 */
@Entity
@Table(name = "USER_TYPE")
public class UserType {

    @Id
    @Column(name = "user_type_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_type")
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
