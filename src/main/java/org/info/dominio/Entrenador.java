package org.info.dominio;

import java.util.UUID;

public class Entrenador {
    private UUID id;
    private String nombre;
    private String apellido;
    private Integer edad;

    private String equipo;

    public Entrenador(String nombre, String apellido, Integer edad, String equipo) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.equipo = equipo;
    }

    public Entrenador() {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.equipo = equipo;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String Equipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
}
