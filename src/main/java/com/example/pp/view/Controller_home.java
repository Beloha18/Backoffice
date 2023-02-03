/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.example.pp.view;

import com.example.pp.model.CallAPI;
import com.example.pp.model.Enchere;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Cédric
 */
@Controller
public class Controller_home  {
    @GetMapping({"/Controller_home"})
    public String home(ModelMap model){
        CallAPI call = new CallAPI();
        ArrayList<Enchere> list = new ArrayList<>();
        try{
            list = call.getAllEnchere();
            model.addAttribute("list", list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "home";
    }
}
