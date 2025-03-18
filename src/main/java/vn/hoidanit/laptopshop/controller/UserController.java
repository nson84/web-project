package vn.hoidanit.laptopshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.hoidanit.laptopshop.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")

    public String getHomepage(Model model) {
        String test = this.userService.handalHello();
        model.addAttribute("son", test);
        return "hello";

    }

    @RequestMapping("/admin/user")
    public String getUserPage(Model model) {
        String test = this.userService.handalHello();
        model.addAttribute("son", test);
        return "admin/user/create";
    }

}
