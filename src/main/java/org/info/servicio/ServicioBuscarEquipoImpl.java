package org.info.servicio;

import org.info.dominio.Equipo;
import org.info.dominio.Jugador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.info.servicio.ServicioEquipo.listaDeEquipos;

public class ServicioBuscarEquipoImpl implements ServicioBuscarEquipo {

    ServicioMenuImpl servicioMenu = new ServicioMenuImpl();
    @Override
    public void buscarEquipo(Integer opc) {
        int respuesta;
        Scanner scanner = new Scanner(System.in);
        List<Jugador> listaPlayer = new ArrayList<>();
        String nombreAbuscar = "";

        Integer cont = 0;
        String capitan = "";
        String dt;
        String jugador = "";
        String nombreEquipo = "";

        System.out.println("INGRESE EL NOMBRE DEL EQUIPO QUE DESEA BUSCAR: ");
        nombreAbuscar = scanner.nextLine();

        //cont = listaDeEquipos.;
        //System.out.println(cont);

        //for (int j = 0; j < listaDeEquipos.size(); j++)
        //    nombreEquipo =  listaDeEquipos.get(j).getNombre();
         // listaPlayer = listaDeEquipos.get(j).getListaJugadores(); NO FUNCIONA


        for (Equipo equipo: listaDeEquipos) {
            //System.out.println(equipo.getNombre());
            //System.out.println(nombreAbuscar);
            nombreEquipo = equipo.getNombre();


            if(nombreAbuscar.equals(nombreEquipo)){
                cont++;
                listaPlayer = equipo.getListaJugadores();
                dt = equipo.getEntrenador().getNombre() + " " + equipo.getEntrenador().getApellido();
                if (opc == 3) {
                    for (int i = 0; i < listaPlayer.size(); i++) {

                        if (listaPlayer.get(i).getEsCapitan()) {
                            capitan = listaPlayer.get(i).getNombre() + " " + listaPlayer.get(i).getApellido() + " (c)";
                            i = listaPlayer.size();

                        }

                    }

                    System.out.println("EQUIPO: " + equipo.getNombre() + " ENTRENADOR: " + dt + " CAPITAN: " + capitan);

                    } else if (opc == 4) {

                        System.out.println("EQUIPO: " + equipo.getNombre() + "\n"+ "ENTRENADOR: " + dt + "\n");
                        System.out.println("LISTA DE JUGADORES");
                        for (int i = 0; i < listaPlayer.size(); i++) {
                            jugador = listaPlayer.get(i).getNombre() + " " + listaPlayer.get(i).getApellido() + " " + listaPlayer.get(i).getEsCapitan();
                            /*if (listaPlayer.get(i).getEsCapitan()) {
                                jugador = jugador + " (c)";
                            }*/
                            System.out.println(jugador);
                        }


                        }
            }



        }

        if(cont == 0){System.out.println("NO SE ECONTRÓ NINGUN EQUIPO LLAMADO " + nombreAbuscar);};


        //System.out.println("INGRESE 1 PARA BUSCAR OTRO EQUIPO - 2 PARA IR AL MENU PRINCIPAL");
        //respuesta = scanner.nextInt();
        //if (respuesta == 1) {
        //    this.buscarEquipo(opc);
        //} else servicioMenu.mostrarMenu();


    }

}
