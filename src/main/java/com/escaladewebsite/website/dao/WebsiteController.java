package com.escaladewebsite.website.dao;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller

public class WebsiteController {

    @GetMapping("/home")
    public ModelAndView getHome(){

            String viewName = "home";

        Map<String,Object> model = new HashMap<String, Object>();

        model.put("numberOfMovies", "1234");

        return new ModelAndView(viewName, model);
    }
    @GetMapping("/login")
    public ModelAndView getLogin (){
        String viewName = "login";
        Map<String,Object> model = new HashMap<String, Object>();
        model.put("numberOfMovies", "1234");
        return new ModelAndView(viewName, model) ;

    }
    @GetMapping("/addtopo")
    public ModelAndView getAddTopo(){
        String viewName = "addtopo";
        Map<String,Object> model = new HashMap<String, Object>();
        model.put("numberOfMovies", "1234");
        return new ModelAndView(viewName, model) ;
    }
}

