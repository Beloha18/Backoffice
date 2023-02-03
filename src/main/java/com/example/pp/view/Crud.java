/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.example.pp.view;

import com.example.pp.model.CallAPI;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class Crud{
    @GetMapping({"/Crud"})
    public String heuree(@RequestParam(value="heure")String heure){
        CallAPI api = new CallAPI();
        try {
            api.insertdurre(heure);
        } catch (Exception ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "crud";
    }

    @PostMapping({"/Crud"})
    public String categorie(@RequestParam(value="categorie")String categorie){
        CallAPI api = new CallAPI();
        try {
            api.insertCategorie(categorie);
        } catch (Exception ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "crud";
    }

    @GetMapping({"/ajj"})
    public String ajj(){
        return "crud";
    }
}
