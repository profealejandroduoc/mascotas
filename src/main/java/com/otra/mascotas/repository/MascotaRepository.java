package com.otra.mascotas.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.otra.mascotas.model.Mascota;

@Repository
public class MascotaRepository {
    List<Mascota> pets=new ArrayList<>();

    public Mascota create(Mascota mascota)
    {
        pets.add(mascota);
        return mascota;
    }

    public List<Mascota> readAll()
    {
        return pets;
    }
}
