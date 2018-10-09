package com.hhm.tr.repository;

/**
 * Created by Han Hlaing Moe on 06.10.2018.
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hhm.tr.model.Task;

@Repository("taskRepository")
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
