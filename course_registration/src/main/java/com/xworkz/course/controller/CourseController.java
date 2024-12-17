package com.xworkz.course.controller;

import com.xworkz.course.dto.CourseDTO;
import com.xworkz.course.entity.CourseEntity;
import com.xworkz.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class


CourseController {
    @Autowired
    CourseService courseService;

    CourseController(){
        System.out.println("no-arg const in controller");
    }

    @PostMapping("/signup")
    public String onSave(Model model, CourseDTO courseDTO){
        System.out.println(courseDTO.toString());
        String valid= courseService.save(courseDTO);
        model.addAttribute("msg",valid);
        return "SignUp.jsp";
    }

//    @PostMapping("/signin")
//    public String onSearch(@RequestParam String email, @RequestParam String password, Model model){
//
//        String valid= courseService.getNameByEmailAndPassword(email,password);
//        model.addAttribute("msg",valid);
//        return "SignIn.jsp";
//    }

    @PostMapping("/signin")
    public String solution(@RequestParam String email,@RequestParam String password,Model model){
        String valid= courseService.validateAndLogin(email, password);
        model.addAttribute("msg","Password Matched");
        return "SignIn.jsp";
    }

//    @GetMapping("/getDetails")
//    public String getDetails(String name,Model model){
//        System.out.println(name);
//        List<CourseEntity> entities=courseService.getAll(name);
//        System.out.println(entities);
//        model.addAttribute("printAll",entities);
//        return "Success.jsp";
//    }
}
