package com.aluracursos.convetidor_monedas.main;

import com.aluracursos.convetidor_monedas.service.BuscarMoneda;
import com.aluracursos.convetidor_monedas.service.Conversion;
import com.aluracursos.convetidor_monedas.service.Convertidor;
import com.aluracursos.convetidor_monedas.modules.Menu;
import com.aluracursos.convetidor_monedas.service.ListadoMonedas;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        BuscarMoneda consulta = new BuscarMoneda();
        ArrayList<Conversion> listaDeConversiones = new ArrayList<>();
        System.out.println("------------------------------------------------------------------------------------------------------\n");
        System.out.println("""
                ¡Bienvenido al converitor de monedas!
                
                Acá podras convertir el valor de una moneda a cualquier moneda de las que 
                tenemos registradas, para ello debes de usar un código especifico que 
                referencia a la moneda que deseas convertir y a la que la vas a convertir.
                Para empezar, selecciona una de las siguientes opciones:
                """);
        while (opcion != 4) {
            Menu menu = new Menu();
            menu.mostrarMenuPrincipal();
            opcion = menu.leerOpcionPrincipal();
            ListadoMonedas listadoMonedas = new ListadoMonedas();

            switch (opcion) {
                case 1:
                    listadoMonedas.lista();
                    break;
                case 2:
                    menu.mostrarMenuMonedas("inicial");
                    String monedaBase = menu.leerOpcionMoneda();
                    menu.mostrarMenuMonedas("final");
                    String monedaFinal = menu.leerOpcionMoneda();
                    Double cantidadCambiar = menu.leerCantidadACambiar();
                    Convertidor conversor = consulta.buscaMoneda(monedaBase);
                    Double tasaDeConversion = conversor.getConversionRate(monedaFinal.toUpperCase());
                    Double cantidadObtenida = menu.cantidadObtenida(monedaBase, cantidadCambiar, tasaDeConversion, monedaFinal);
                    Conversion nuevaConversion = new Conversion(monedaBase, monedaFinal, cantidadCambiar, cantidadObtenida);
                    listaDeConversiones.add(nuevaConversion);
                    break;
                case 3:
                    menu.imprimirConversiones(listaDeConversiones);
                    break;
                case 4:
                    System.out.println("Gracias por utilizar el convertidor de moneda");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del menú.");
            }

        }
    }
}
