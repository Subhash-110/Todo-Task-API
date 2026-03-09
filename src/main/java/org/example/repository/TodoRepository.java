package org.example.repository;

import org.example.model.Todos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todos, Long> {
}