package com.example.todo_app.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@Entity //database de bir table a karşılık geldiğini belirtir
@Table(name = "todo") //db deki collectiona denklik
public class todo { //Entityler burda içerşr ilk burda implement ediyoruz
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id başlangıcını otomatik başlatır
    private long id;
    private String task;
    private boolean result;

    
}
