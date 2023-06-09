package org.info.servicio;

import org.info.dominio.Equipo;

import java.util.ArrayList;
import java.util.List;

public interface ServicioEquipo {
    List<Equipo> listaDeEquipos = new ArrayList<>();
    Equipo crearEquipo();

}
