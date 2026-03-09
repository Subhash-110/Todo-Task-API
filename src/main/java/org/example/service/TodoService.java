package org.example.service;

import org.example.model.Todos;
import java.util.List;

public interface TodoService {

    List<Todos> getAllTodos();

    Todos createTodo(Todos todo);

    Todos updateTodo(Long id, Todos todo);

    void deleteTodo(Long id);
}