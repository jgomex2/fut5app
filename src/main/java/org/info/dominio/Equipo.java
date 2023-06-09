package org.info.dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Equipo {
    private UUID id;
    private String nombre;
    private LocalDateTime fechaDeCreacion;

    private List<Jugador> listaJugadores = new ArrayList<>();
    private Entrenador entrenador;



    public Equipo(String nombre, LocalDateTime fechaDeCreacion, List<Jugador> listaJugadores, Entrenador entrenador) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.fechaDeCreacion = fechaDeCreacion;
        this.listaJugadores = listaJugadores;
        this.entrenador = entrenador;
    }

    public Equipo() {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.fechaDeCreacion = fechaDeCreacion;
        this.listaJugadores = listaJugadores;
        this.entrenador = entrenador;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(LocalDateTime fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    @Override
    public String toString() {
        String mostrar="";
        mostrar = "Equipo {" +
                "nombre='" + nombre + '\'' +
                ", Entrenador='" + entrenador.getNombre() + " " + entrenador.getApellido() + '\'' +
                ", Fecha de creación=" + fechaDeCreacion +
                ", Lista de jugadores=[" ;
        for ( int i=0; i < listaJugadores.size();i++  ) {
            mostrar = mostrar + listaJugadores.get(i).getNombre() + " " + listaJugadores.get(i).getApellido() +  ", ";
        }
        mostrar += "]";
        return mostrar;
    }
}
