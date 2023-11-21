package com.examen2.examen2.servicios;

import java.util.List;

import com.examen2.examen2.modelos.Vehiculos;

public interface CrearVehiculoService {

    public Vehiculos crearVehiculo(Vehiculos nvoVehiculo);

    public List<Vehiculos> obtenerTodos();

    public Vehiculos obtenerVehiculoId(int id);
}
