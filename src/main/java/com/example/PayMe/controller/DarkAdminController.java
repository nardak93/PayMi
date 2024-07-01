package com.example.PayMe.controller;

import com.example.PayMe.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.PayMe.service.UserService;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public class DarkAdminController {
//    @Autowired
    UserService userService;




    @GetMapping("/darkadmin")
    public String getUsersDarkAdmin(Model model, RedirectAttributes ra) {
        User darkAdmin = UserService.getConnectedUser();
        model.addAttribute("darkAdmin", darkAdmin);
        model.addAttribute("users", userService.getAllUser());
        return "darkAdminProfil";
    }
}
