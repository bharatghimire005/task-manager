package com.task.manager.repository;

import com.task.manager.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by bharatghimire on 21/10/15.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    public User findAllByName(String name);

}
