package ru.job4j.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.job4j.ioc00.User00;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


@Controller
public class UserController {

   final List<User00> users = new CopyOnWriteArrayList<User00>();

   @RequestMapping(value = "/user", method = RequestMethod.GET)
   public String showItem(ModelMap model) {
      model.addAttribute("user", this.users);
      return "user.jsp";
   }

   @RequestMapping(value = "/user", method = RequestMethod.POST)
   public String addItem(@ModelAttribute User00 user) {
      this.users.add(user);
      return "redirect:user.jsp";
   }

}