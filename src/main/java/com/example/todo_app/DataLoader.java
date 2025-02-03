package com.example.todo_app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.todo_app.Model.todo;
import com.example.todo_app.Repository.TodoRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final TodoRepository todoRepository;

    public DataLoader(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public void run(String... args) {
        todoRepository.save(new todo("","Finish homework", false));
        todoRepository.save(new todo("", "Go shopping", false));
        
    }
}