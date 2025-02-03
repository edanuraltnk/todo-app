package com.example.todo_app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo_app.Service.TodoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController //http üzerinden dataya erişim sağlayıp işlem yapma düzeni saplar
@RequestMapping("/todo") //base url
public class todoController {
    
    @Autowired
    private TodoService todoService;



}
