package com.in28minutes.springboot.myfirstwebapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private  static List<Todo> todos = new ArrayList<>();
    private static int todoCount = 0;
    static {
       todos.add(new Todo(++todoCount, "in28minutes", "GET Learn AWS Certified",
               LocalDate.now().plusYears(1),false));
        todos.add(new Todo(++todoCount, "in28minutes", "Learn DEVOPS",
                LocalDate.now().plusYears(2),false));
        todos.add(new Todo(++todoCount, "in28minutes", "Learn Learn Full Stack Development",
                LocalDate.now().plusYears(3),false));
    }
    public List<Todo> findByUsername(String username){

        return todos;
    }
    public void addTodo(String username, String description, LocalDate tergetDate, boolean done){
        Todo todo = new Todo(++todoCount,username,description,tergetDate,done);
        todos.add(todo);

    }
    public void deleteByID(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }
    public Todo findById(int id){
        Predicate<? super Todo> predicate
                = todo -> todo.getId() == id;
       Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
    }
    public void updateTodo(@Valid Todo todo){
  deleteByID(todo.getId());
  todos.add(todo);
    }
}
