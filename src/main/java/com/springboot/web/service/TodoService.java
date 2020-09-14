package com.springboot.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.dao.TodoRepo;
import com.springboot.web.model.Todo;

@Service
public class TodoService {

	@Autowired
	TodoRepo todoRepo;

	public List<Todo> retrieveTodos(String user) {

		return todoRepo.findByUser(user);
	}

	public Todo retrieveTodo(int id) {

		return todoRepo.findOne(id);
	}

	public void updateTodo(Todo todo) {
		todoRepo.save(todo);
	}

	public void addTodo(Todo todo) {
		todoRepo.save(todo);
	}

	public void deleteTodo(int id) {
		todoRepo.delete(id);
	}
}