package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
    private  static List<Todo> todos;
    static {
       todos.add(new Todo(1, "in28minutes", "Learn AWS",
               LocalDate.now().plusYears(1),false));
        todos.add(new Todo(1, "in28minutes", "Learn DEVOPS",
                LocalDate.now().plusYears(2),false));
        todos.add(new Todo(1, "in28minutes", "Learn Learn Full Stack Developer",
                LocalDate.now().plusYears(3),false));
    }

    public static List<Todo> findByUsername(String username){
      return todos;
    }
}
