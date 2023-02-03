/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.example.pp.view;

import com.example.pp.model.CallAPI;
import com.example.pp.model.Proposition;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.ArrayList;
@Controller
public class Controller_Statistique {
    @GetMapping({"/Controller_Statistique"})
    public String stat(ModelMap model, @RequestParam(value="id")String id) throws IOException {
        CallAPI call = new CallAPI();
        ArrayList<Proposition> list = call.getPropositionsOf(id);
        model.addAttribute("list",list);
        return "statistique";
    }
}
