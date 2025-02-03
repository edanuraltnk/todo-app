package com.example.todo_app.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo_app.Model.todo;
import com.example.todo_app.Service.TodoService;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController //http üzerinden dataya erişim sağlayıp işlem yapma düzeni sağlar
@RequestMapping("/todo") //base url
public class todoController {
    
    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<todo> getAllTodos() {
        return todoService.getAllTodos();
    }
        @GetMapping("/{id}")
    public Optional<todo> getTodoById(@PathVariable String id) {
        return todoService.getById(id);
    }

    @PostMapping
    public todo createTodo(@RequestBody todo todo) {
        return todoService.create(todo);
    }

    @PutMapping("/{id}")
    public todo updateTodo(@PathVariable String id, @RequestBody todo todo) {
        return todoService.update(id, todo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable String id) {
        todoService.deleteTodos(id);
    }



}
