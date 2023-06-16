package org.info.servicio;
import org.info.dominio.Equipo;

import java.util.Scanner;

import static org.info.servicio.ServicioEquipo.listaDeEquipos;

public class ServicioEliminarEquipoImpl implements ServicioEliminarEquipo {

    @Override
    public void eliminarEquipo() {
        String equipoAeliminar;
        Integer respuesta = 0;
        boolean equipoEncontrado = false;

        System.out.println("INGRESE EL NOMBRE DEL EQUIPO QUE DESEA ELIMINAR: ");
        Scanner scanner = new Scanner(System.in);
        equipoAeliminar= scanner.nextLine();
        System.out.println("ESTA SEGURO DE ELIMINAR EL EQUIPO " + equipoAeliminar + ": 1 SI - 2 NO");
        respuesta = scanner.nextInt();

        if(respuesta == 1){
            for (Equipo equipo: listaDeEquipos){
                if (equipo.getNombre().equals(equipoAeliminar)) {
                    System.out.println("equipo eliminado " + equipo.getNombre());
                    listaDeEquipos.remove(equipo);
                    equipoEncontrado = true;
                    break;
                }
            }

            if(equipoEncontrado == false){
                System.out.println("NO SE ENCONTRO EL EQUIPO LLAMADO " + equipoAeliminar);
            }
        }


        System.out.println("LISTA DE EQUIPOS ACTUALIZADA");
        for(Equipo equipo: listaDeEquipos){
            System.out.println(equipo.getNombre());

        }

    }





}

