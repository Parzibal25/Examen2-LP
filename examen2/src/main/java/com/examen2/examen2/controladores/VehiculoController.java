package com.examen2.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen2.examen2.servicios.CrearVehiculoService;

@RestController
@RequestMapping("/api/vehiculo")
public class VehiculoController {

    @Autowired
    private CrearVehiculoService crearVehiculosService;

    @PostMapping("/crear")
    public Vehiculo crearVehiculo(@RequestBody Vehiculo nvoVehiculo) {
        if(nvoVehiculo.get)
    }
}
