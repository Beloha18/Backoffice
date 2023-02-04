/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.example.ezaka.view;

import com.example.ezaka.model.CallAPI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
