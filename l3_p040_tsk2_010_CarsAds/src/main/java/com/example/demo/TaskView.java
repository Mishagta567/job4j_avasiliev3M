package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Controller
public class TaskView {

    @Autowired
    TaskRepository repository;

    @RequestMapping("/main")
    public String taskList(Map<String, Object> model) {
//        List<Task> allTasks = repository.findAll();
        List<Task> allTasks = new ArrayList<Task>();
        allTasks.add(new Task("Descr 1", "user 1"));
        allTasks.add(new Task("Descr 2", "user 2"));
        allTasks.add(new Task("Descr 3", "user 3"));
        model.put("tasks", allTasks);
        return "index";
    }

    @RequestMapping("/add")
    public String getAdd(Model model) {
        model.addAttribute("task", new Task());
        return "task-add";
    }

    @PostMapping("/add")
    public RedirectView greetingSubmit(@ModelAttribute Task task) {
        repository.save(task);
        return new RedirectView("/main");
    }

}
