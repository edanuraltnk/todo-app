package com.example.todo_app.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@Document(collection  = "todo-app") //db deki collectiona denklik
public class todo { //Entityler burda içerşr ilk burda implement ediyoruz
    @Id
    private String id;
    private String task;
    private boolean result;

    
}
