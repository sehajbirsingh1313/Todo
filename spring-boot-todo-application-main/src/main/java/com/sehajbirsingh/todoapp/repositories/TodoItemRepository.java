package com.sehajbirsingh.todoapp.repositories;

import com.sehajbirsingh.todoapp.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
}
