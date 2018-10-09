package com.hhm.tr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hhm.tr.model.Task;
import com.hhm.tr.model.User;
import com.hhm.tr.model.UserTask;

import java.util.List;

@Repository("userTaskRepository")
public interface UserTaskRepository extends JpaRepository<UserTask, Integer> {
    List<UserTask> findByTask (Task task);
    List<UserTask> findByUser (User user);
}
