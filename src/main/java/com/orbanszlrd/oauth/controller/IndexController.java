package com.orbanszlrd.oauth.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class IndexController {
    @GetMapping("/")
    public String index(@AuthenticationPrincipal OAuth2User user, Model model) {
        System.out.println(user);
        model.addAttribute("user", user);

        return "index";
    }
}
