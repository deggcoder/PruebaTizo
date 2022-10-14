/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tizo.challenge.controller;

import com.tizo.challenge.repo.IProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {
    
    @Autowired
    private IProductoRepo productoRepo;
    // Para mappear a la página de inicio
    @GetMapping("/")
    public String inicio(Model model) {
        var productos = productoRepo.findAll();
        model.addAttribute("productos", productos);
        return "index";
    }
}
