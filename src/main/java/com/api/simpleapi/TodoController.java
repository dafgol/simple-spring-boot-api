package com.api.simpleapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @RequestMapping("/todos")
    public String[] getTodos () {

        String[] todos = new String[] {"Clean", "Eat", "Shop for food", "Workout"};

        return todos;
    }
}
