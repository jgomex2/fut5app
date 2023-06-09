package org.info.dominio;

import java.util.UUID;

public class Jugador {

    private UUID id;
    private String nombre;
    private String apellido;

    private Equipo equipo;
    private Double altura;
    private Integer cantDePartidos;
    private Integer cantDeGoles;
    private Integer numeroDeCamiseta;
    private Boolean esCapitan;

    private String posicion;

    //String[] arrPosicion = {"Arquero", "Defensor", "Mediocampista", "Delantero"};

    public Jugador(String nombre, String apellido, Equipo equipo, Double altura, Integer cantDePartidos, Integer cantDeGoles, Integer numeroDeCamiseta, Boolean esCapitan, String posicion) {
        this.id =UUID.randomUUID();
        this.nombre = nombre;
        this.apellido = apellido;
        this.equipo = equipo;
        this.altura = altura;
        this.cantDePartidos = cantDePartidos;
        this.cantDeGoles = cantDeGoles;
        this.numeroDeCamiseta = numeroDeCamiseta;
        this.esCapitan = esCapitan;
        this.posicion = posicion;
    }

    public Jugador() {
        this.id =UUID.randomUUID();
        this.nombre = nombre;
        this.apellido = apellido;
        this.equipo = equipo;
        this.altura = altura;
        this.cantDePartidos = cantDePartidos;
        this.cantDeGoles = cantDeGoles;
        this.numeroDeCamiseta = numeroDeCamiseta;
        this.esCapitan = esCapitan;
        this.posicion = posicion;
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

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getCantDePartidos() {
        return cantDePartidos;
    }

    public void setCantDePartidos(Integer cantDePartidos) {
        this.cantDePartidos = cantDePartidos;
    }

    public Integer getCantDeGoles() {
        return cantDeGoles;
    }

    public void setCantDeGoles(Integer cantDeGoles) {
        this.cantDeGoles = cantDeGoles;
    }

    public Integer getNumeroDeCamiseta() {
        return numeroDeCamiseta;
    }

    public void setNumeroDeCamiseta(Integer numeroDeCamiseta) {
        this.numeroDeCamiseta = numeroDeCamiseta;
    }

    public Boolean getEsCapitan() {
        return esCapitan;
    }

    public void setEsCapitan(Boolean esCapitan) {
        this.esCapitan = esCapitan;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    //for (int i = 0; i <= arrPosicion.length ; i++)
    //    System.out.println((i+1) + ". " + arrPosicion[i]);

}
