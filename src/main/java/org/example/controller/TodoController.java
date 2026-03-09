package org.example.controller;

import org.example.model.Todos;
import org.example.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Todos> getTodos() {
        return service.getAllTodos();
    }

    @PostMapping
    public Todos createTodo(@RequestBody Todos todo) {
        return service.createTodo(todo);
    }

    @PutMapping("/{id}")
    public Todos updateTodo(@PathVariable Long id, @RequestBody Todos todo) {
        return service.updateTodo(id, todo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        service.deleteTodo(id);
    }
}