package com.example.todo_app.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.todo_app.Model.todo;

@Repository
public interface TodoRepository extends MongoRepository<todo, String> {
 // databse ve entity yani model sınıf arasındaki iletişimi sağlar
 // ilk parametre hangi entity ile çalışacağımızı gösterir, long kısmı ise idnin type ını verir
     
} 
