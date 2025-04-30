package com.otra.mascotas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.otra.mascotas.model.Mascota;
import com.otra.mascotas.service.MascotaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;







@RestController
@RequestMapping("/api/mascotas")
public class MascotasController {
    @Autowired
    private MascotaService mascotaservice;   
    

    @PostMapping
    public Mascota postMascota(@RequestBody Mascota mascota) {
        return mascotaservice.guardarMascota(mascota);
    }

    @GetMapping
    public List<Mascota> getMascotas() {
        return mascotaservice.listarTodas();
    }
    
    

  
    
}
