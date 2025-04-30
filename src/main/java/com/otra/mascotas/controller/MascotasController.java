package com.otra.mascotas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.otra.mascotas.model.Mascota;
import com.otra.mascotas.service.MascotaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;






@RestController
@RequestMapping("/api/mascotas")
public class MascotasController {
    @Autowired
    private MascotaService mascotaservice;   
    
    @GetMapping
    public String algo() {
        return "Ahora si";
    }

    @PostMapping
    public Mascota postMascota(@RequestBody Mascota mascota) {
        return mascotaservice.guardarMascota(mascota);
    }
    

  
    
}
