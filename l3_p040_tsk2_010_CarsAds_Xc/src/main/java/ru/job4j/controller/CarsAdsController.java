package ru.job4j.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.job4j.ioc00.User00;
import ru.job4j.models.CarAd;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


@Controller
public class CarsAdsController {

   final List<CarAd> allAds = new CopyOnWriteArrayList<CarAd>();

   @RequestMapping(value = "/carads", method = RequestMethod.GET)
   public String showItem(ModelMap model) {
      model.addAttribute("carads", this.allAds);
      return "carads.jsp";
   }

   @RequestMapping(value = "/carads", method = RequestMethod.POST)
   public String addItem(@ModelAttribute CarAd carAd) {
      this.allAds.add(carAd);
      return "redirect:carads.jsp";
   }

   @RequestMapping({"/chack", ""})
   public String showJoke(Model model){

//      model.addAttribute("joke", jokeService.getJoke());

      return "chucknorris";
   }

}