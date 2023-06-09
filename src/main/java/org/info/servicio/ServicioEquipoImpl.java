package org.info.servicio;

import org.info.dominio.Entrenador;
import org.info.dominio.Equipo;
import org.info.dominio.Jugador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.time.LocalDateTime;
public class ServicioEquipoImpl implements ServicioEquipo{

    @Override
    public Equipo crearEquipo() {
        List<Jugador> listaJugdores = new ArrayList<>();
        Entrenador nuevoEntrenador = new Entrenador();
        Equipo equipoNuevo = new Equipo();
        equipoNuevo.setId(UUID.randomUUID());

        Scanner scanner = new Scanner(System.in);

        System.out.println("INGRESE EL NOMBRE DEL EQUIPO: ");
        String nomEquipo = scanner.nextLine();
        equipoNuevo.setNombre(nomEquipo);
        equipoNuevo.setFechaDeCreacion(LocalDateTime.now());

        nuevoEntrenador.setId(UUID.randomUUID());
        System.out.println("INGRESE EL NOMBRE DEL ENTRENADOR: ");
        nuevoEntrenador.setNombre(scanner.nextLine());
        System.out.println("INGRESE EL APELLIDO DEL ENTRENADOR: ");
        nuevoEntrenador.setApellido(scanner.nextLine());
        System.out.println("INGRESE LA EDAD DEL ENTRENADOR: ");
        nuevoEntrenador.setEdad(scanner.nextInt());
        nuevoEntrenador.setEquipo(nomEquipo);

        equipoNuevo.setEntrenador(nuevoEntrenador);

        String[] arrPosicion = {"Arquero", "Defensor", "Mediocampista", "Delantero"};

        //Creación de la lista de jugadores

        Boolean capitan = false;//var para control de capitan y arquero
        Boolean arquero = false;
        Integer respuesta = 0;

        for (int i = 0; i<2; i++) {
            Jugador nuevoJugador = new Jugador();
            nuevoJugador.setId(UUID.randomUUID());
            System.out.println("INGRESE EL NOMBRE DEL JUGADOR: ");
            nuevoJugador.setNombre(scanner.next());
            System.out.println("INGRESE EL APELLIDO DEL JUGADOR: ");
            nuevoJugador.setApellido(scanner.next());
            System.out.println("INGRESE LA ALTURA DEL JUGADOR: ");
            nuevoJugador.setAltura(scanner.nextDouble());
            System.out.println("INGRESE EL NUMERO DE CAMISETA: ");
            nuevoJugador.setNumeroDeCamiseta(scanner.nextInt());
            System.out.println("INGRESE CANTIDAD DE PARTIDOS: ");
            nuevoJugador.setCantDePartidos(scanner.nextInt());
            System.out.println("INGRESE CANTIDAD DE GOLES: ");
            nuevoJugador.setCantDeGoles(scanner.nextInt());
            nuevoJugador.setEsCapitan(false);
            if (!capitan){
                System.out.println("ESTE JUGADOR SERÁ EL CAPITAN?? INGRESE 1 SI - 2 NO");
                respuesta = scanner.nextInt();
                if (respuesta == 1){
                    nuevoJugador.setEsCapitan(true);
                    capitan = true;
                }

            }//else nuevoJugador.setEsCapitan(false);

            System.out.println("INGRESE LA POSICION DEL JUGADOR: ");
            for (int j = 0; j < arrPosicion.length ; j++)
                System.out.println((j+1) + ". " + arrPosicion[j]);

            Integer k = scanner.nextInt();
            nuevoJugador.setPosicion(arrPosicion[k-1]);
            nuevoJugador.setEquipo(equipoNuevo);
            //equipoNuevo.setListaJugadores();
            listaJugdores.add(nuevoJugador);


        }
        equipoNuevo.setListaJugadores(listaJugdores);
        listaDeEquipos.add(equipoNuevo);
        //System.out.println(equipoNuevo.toString());
        System.out.println(" EL EQUIPO " + equipoNuevo.getNombre() + " FUE CREADO CON EXITO");


        return equipoNuevo;
    }
}
