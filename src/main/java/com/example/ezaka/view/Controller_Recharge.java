/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.example.ezaka.view;

import com.example.ezaka.model.CallAPI;
import com.example.ezaka.model.Recharge;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
@Controller
public class Controller_Recharge{
    @GetMapping({"/Controller_Recharge"})
    public String liste(ModelMap model) throws IOException {
        CallAPI api = new CallAPI();
        List<Recharge> liste = api.liste_recharger("0");
        model.addAttribute("liste", liste);
        return "recharge";
    }
    @PostMapping({"/Controller_Recharge"})
    public String valider(@RequestParam(value="valider")String valider,
                          @RequestParam(value="id")String id,
                          @RequestParam(value="idclient")String idclient,
                          @RequestParam(value="vola")String vola){
        
        CallAPI api = new CallAPI(); 
        if(valider.equals("confirmer")){
            try {
                boolean val = api.confirm(id,idclient,vola);
            } catch (Exception ex) {
                Logger.getLogger(Controller_Recharge.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(valider.equals("decliner")){
            try {
                boolean val = api.decline(id);
            } catch (Exception ex) {
                Logger.getLogger(Controller_Recharge.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return "home";
    }
}
