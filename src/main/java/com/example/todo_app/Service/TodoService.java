package com.example.todo_app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo_app.Model.todo;
import com.example.todo_app.Repository.TodoRepository;

@Service
public class TodoService { // controllerdaki apiler işlem yapabilsin diye func yazılır buraya
    //repository ile bağlantı kurararak yapar
    @Autowired
    private TodoRepository todoRepository;

    public void deleteTodos(Long Id){
        todoRepository.deleteById(Id);
        
    }
    public List<todo> getAllTaTodos(){
        return todoRepository.findAll();
    }
    public todo create( todo todonew){
        return todoRepository.save(todonew);
    }

    public Optional<todo> getById(Long Id){
        return todoRepository.findById(Id);
    }

    public todo update(Long id, todo todonew){
        if( todoRepository.existsById(id)){
            todonew.setId(id);
            return todoRepository.save(todonew);
        }
        else{
            return null;
        }
    }

    
}
