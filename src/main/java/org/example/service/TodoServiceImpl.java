package org.example.service;

import org.example.model.Todos;
import org.example.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    private final TodoRepository repository;

    public TodoServiceImpl(TodoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Todos> getAllTodos() {
        return repository.findAll();
    }

    @Override
    public Todos createTodo(Todos todo) {
        return repository.save(todo);
    }

    @Override
    public Todos updateTodo(Long id, Todos todo) {

        Todos existing = repository.findById(id).orElseThrow();

        existing.setTitle(todo.getTitle());
        existing.setDescription(todo.getDescription());
        existing.setCompleted(todo.isCompleted());

        return repository.save(existing);
    }

    @Override
    public void deleteTodo(Long id) {
        repository.deleteById(id);
    }
}