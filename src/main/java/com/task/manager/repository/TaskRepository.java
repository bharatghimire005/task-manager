package com.task.manager.repository;

import com.task.manager.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Navkrishna on 21/10/15
 */
@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
}
