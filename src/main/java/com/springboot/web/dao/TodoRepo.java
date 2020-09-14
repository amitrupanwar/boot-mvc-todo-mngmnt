package com.springboot.web.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.web.model.Todo;

@Repository
public interface TodoRepo extends CrudRepository<Todo, Integer> {
	List<Todo> findByUser(String userName);
}
