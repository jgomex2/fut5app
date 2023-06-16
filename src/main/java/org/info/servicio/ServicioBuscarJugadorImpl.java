package org.info.servicio;

import org.info.dominio.Equipo;
import org.info.dominio.Jugador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.info.servicio.ServicioEquipo.listaDeEquipos;

public class ServicioBuscarJugadorImpl implements ServicioBuscarJugador{
    ServicioMenuImpl servicioMenu = new ServicioMenuImpl();
    @Override
    public void buscarJugador() {
        //int respuesta;
        Scanner scanner = new Scanner(System.in);
        List<Jugador> listaPlayer = new ArrayList<>();

        System.out.println("INGRESE EL NOMBRE DEL JUGADOR QUE DESEA BUSCAR: ");
        String nombreAbuscar = scanner.nextLine();
        Integer cont = 0;
        String nombre;
        String capitan = "No";
        Boolean prueba = false;


        for (Equipo equipo: listaDeEquipos) {

            listaPlayer = equipo.getListaJugadores();
                capitan = "No";
                for (int i =0; i< listaPlayer.size();i++) {
                    prueba = listaPlayer.get(i).getEsCapitan().booleanValue();
                    if (listaPlayer.get(i).getNombre().equals(nombreAbuscar) ){
                        cont++;
                        if (listaPlayer.get(i).getEsCapitan().booleanValue()){
                            capitan = "Sí";
                        }
                        if (cont ==1) {
                            System.out.println("JUGADOR/ES QUE COINCIDEN CON EL CRITERIO DE BUSQUEDA");
                        }
                        System.out.println("NOMBRE: "+ listaPlayer.get(i).getNombre() + " APELLIDO: " + listaPlayer.get(i).getApellido() + " " + listaPlayer.get(i).getPosicion() +" CAPITAN: "+ capitan + " "+ equipo.getNombre());
                        capitan = "No";
                        }

                }

        }

        if(cont == 0){System.out.println("NO SE ECONTRÓ NINGUN JUGADOR LLAMADO " + nombreAbuscar);};
    }
}
