package org.info.servicio;

import java.util.Scanner;

import static org.info.servicio.ServicioEquipo.listaDeEquipos;

public class ServicioMenuImpl implements ServicioMenu {


    @Override
    public void mostrarMenu() {
        ServicioBuscarJugadorImpl servicioBuscarJugador = new ServicioBuscarJugadorImpl();
        ServicioBuscarEquipoImpl servicioBuscarEquipo = new ServicioBuscarEquipoImpl();
        ServicioEliminarEquipoImpl servicioEliminarEquipo = new ServicioEliminarEquipoImpl();

        ServicioEquipoImpl servicioEquipo = new ServicioEquipoImpl();
        System.out.println("Bienvenido a Fut5app");
        System.out.println("\n" +
                "*****MENU PRINCIPAL*****");
        System.out.println("1. Crear equipo");
        System.out.println("2. Buscar Jugador por Nombre");
        System.out.println("3. Buscar Equipo por nombre (Muestra nombre del DT y Capitán del equipo seleccionado)");
        System.out.println("4. Buscar Equipo por nombre (Muestra información completa del equipo)");
        System.out.println("5. Eliminar Equipo por nombre");
        System.out.println("6. Importar la lista de jugadores de un equipo desde un archivo");
        System.out.println("7. Exportar la lista de jugadores hacia un archivo");
        System.out.println("Por favor elija una de las opciones: ");


        Scanner scanner = new Scanner(System.in);

        String opc = scanner.nextLine();
        Integer siOno;
        switch(opc) {
            case "1":
                // code block
                System.out.println("USTED ELIGIO LA OPCION DE CARGAR UN NUEVO EQUIPO ");
                siOno = 2;
                do {
                    servicioEquipo.crearEquipo();
                    System.out.println("DESEA CARGAR OTRO EQUIPO?? 1 SI - 2 NO");

                    siOno = scanner.nextInt();

                    }while(siOno==1);
                //System.out.println(listaDeEquipos);
                this.mostrarMenu();

                break;


            case "2":
                // code block
                System.out.println("Opción elegida: Buscar Jugador por Nombre");
                siOno = 2;
                do {
                    servicioBuscarJugador.buscarJugador();
                    System.out.println("DESEA BUSCAR OTRO JUGADOR?? 1 SI - 2 NO");

                    siOno = scanner.nextInt();

                }while(siOno==1);
                this.mostrarMenu();
                break;
            case "3":
                // code block
                System.out.println("Opción elegida: Buscar Equipo por nombre");
                siOno = 2;
                do {
                    servicioBuscarEquipo.buscarEquipo(3);
                    System.out.println("DESEA BUSCAR OTRO EQUIPO?? 1 SI - 2 NO");

                    siOno = scanner.nextInt();

                }while (siOno==1);
                this.mostrarMenu();
                break;
            case "4":
                // code block
                System.out.println("Opción elegida: Buscar Equipo por nombre (Muestra información completa del equipo)");
                siOno = 2;
                do {
                    servicioBuscarEquipo.buscarEquipo(4);
                    System.out.println("DESEA BUSCAR OTRO EQUIPO?? 1 SI - 2 NO");

                    siOno = scanner.nextInt();

                }while(siOno==1);
                this.mostrarMenu();
                break;
            case "5":
                // code block
                System.out.println("Opción elegida: Eliminar Equipo por nombre");
                servicioEliminarEquipo.eliminarEquipo();
                this.mostrarMenu();
                break;
            case "6":
                // code block
                System.out.println("Opción elegida: Importar la lista de jugadores de un equipo desde un archivo");
                break;
            case "7":
                // code block
                System.out.println("Opción elegida: \n" + scanner.nextLine());
                break;
            default:
                // code block
                System.out.println("La opción elegida no es correcta, por favor vuelva a intentarlo ");

        }
    }
}
