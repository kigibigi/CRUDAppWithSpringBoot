package com.bmocl.appWithSpringBoot.controller;

import com.bmocl.appWithSpringBoot.model.User;
import com.bmocl.appWithSpringBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/app")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all_users")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getListUser());
        return "/users/all_users";
    }

    @GetMapping("/user")
    public String getUserById(@RequestParam(value = "id", required = false) long id,
                              Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "users/show_user";
    }

    @GetMapping("/new_user")
    public String getFormNewUser(Model model) {
        model.addAttribute("user", new User());
        return "users/new";
    }

    @PostMapping("/all_users")
    public String createUser(@ModelAttribute("user") User user) {
        userService.addUser(user);
        return "redirect:/app/all_users";
    }

    @GetMapping("/edit")
    public String getFormEditUser(@RequestParam(value = "id", required = false) int id,
                             Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "/users/edit";
    }

    @PatchMapping("/edit")
    public String updateUser(@ModelAttribute("user") User user,
                             @RequestParam(value = "id", required = false) int id) {
        userService.updateUser(id, user);
        return "redirect:/app/all_users";
    }

    @DeleteMapping("/user")
    public String deleteUser(@RequestParam(value = "id", required = false) int id) {
        userService.deleteUser(id);
        return "redirect:/app/all_users";
    }
}
