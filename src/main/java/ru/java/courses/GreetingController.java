package ru.java.courses;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController
{

    @GetMapping("/green")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,
                           Map<String, Object> model)
    {
        System.out.println("11111");
        model.put("name", name);
        System.out.println("fdsfdsf");
        return "greeting";
    }

}
