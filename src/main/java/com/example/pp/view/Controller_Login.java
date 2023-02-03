package com.example.pp.view;

import com.example.pp.model.CallAPI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller_Login {
    @GetMapping({"/"})
    public String login(){
        return "index";
    }

    @PostMapping({"/Login"})
    public String login(@RequestParam(value="admin_email")String admin_email,@RequestParam(value="admin_mdp")String admin_mdp){
        CallAPI call = new CallAPI();
        boolean log = false;
        try {
            log = call.loginAdmin(admin_email, admin_mdp);
        } catch (Exception ex) {}

        String ret = "index";
        if (log) {
            ret =  "redirect:/Controller_home";
        }

        return ret;
    }
}
