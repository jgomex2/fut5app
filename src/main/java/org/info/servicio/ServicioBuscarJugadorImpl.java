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

        for (Equipo equipo: listaDeEquipos) {

            listaPlayer = equipo.getListaJugadores();

                //System.out.println("JUGADOR/ES QUE COINCIDEN CON EL CRITERIO DE BUSQUEDA");
                for (int i =0; i< listaPlayer.size();i++) {

                    if (listaPlayer.get(i).getNombre().equals(nombreAbuscar) ){
                        cont++;
                        if (cont ==1) {
                            System.out.println("JUGADOR/ES QUE COINCIDEN CON EL CRITERIO DE BUSQUEDA");
                        }
                        System.out.println(listaPlayer.get(i).getNombre() + " " + listaPlayer.get(i).getApellido() + " " + listaPlayer.get(i).getPosicion() +" "+ equipo.getNombre());

                        }

                }

        }

        if(cont == 0){System.out.println("NO SE ECONTRÓ NINGUN JUGADOR LLAMADO " + nombreAbuscar);};

        //servicioMenu.mostrarMenu();
        //PASAR ESTA ESTRUCUTA AL MENU AL IGUAL QUE CREAR EQUIPO
        /*System.out.println("INGRESE 1 PARA BUSCAR OTRO JUGADOR - 2 PARA IR AL MENU PRINCIPAL");
        respuesta = scanner.nextInt();
        if (respuesta == 1) {
            this.buscarJugador();
            } else servicioMenu.mostrarMenu();*/

    }
}
