package com.xworkz.details.controller;

import com.xworkz.details.dto.AdminDTO;
import com.xworkz.details.service.AdminService;
import com.xworkz.details.service.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AdminController {
    @Autowired
    private AdminService adminService;

    AdminController(){

    }

    @PostMapping("/save")
        public String onSave(AdminDTO dto){
            System.out.println(dto.toString());
            boolean saved = adminService.save(dto);
            if(saved){
                return "Success.jsp";
            }
            return "Login.jsp";
        }
    }

