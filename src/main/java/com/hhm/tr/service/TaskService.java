package com.hhm.tr.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.hhm.tr.model.Task;
import com.hhm.tr.repository.TaskRepository;

@Service
@Transactional
public class TaskService {

	private final TaskRepository taskRepository;
	

	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	
	public List<Task> findAll(){
		List<Task> tasks = new ArrayList<>();
		tasks = taskRepository.findAll();
		return tasks;
	}
	
	public Task findTask(int id){
		return taskRepository.findOne(id);
	}
	
	public void save(Task task){
		taskRepository.save(task);
	}
	
	public void delete(int id){
		taskRepository.delete(id);

	}
}
