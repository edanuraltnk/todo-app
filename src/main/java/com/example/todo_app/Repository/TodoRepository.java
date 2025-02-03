package com.example.todo_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todo_app.Model.todo;

public interface TodoRepository extends JpaRepository<todo, Long> {
 // databse ve entity yani model sınıf arasındaki iletişimi sağlar
 // ilk parametre hangi entity ile çalışacağımızı gösterir, long kısmı ise idnin type ını verir
     
} 
