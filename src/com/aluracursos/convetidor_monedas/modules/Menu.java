package com.aluracursos.convetidor_monedas.modules;

import com.aluracursos.convetidor_monedas.service.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.google.gson.Gson;

public class Menu {
    public ListadoMonedas listadoMonedas = new ListadoMonedas();
    public LectorListaMonedas lectorListaMonedas = new LectorListaMonedas();


    private final String monedasDisponibles = """
            {
              "result": "success",
              "documentation": "https://www.exchangerate-api.com/docs",
              "terms_of_use": "https://www.exchangerate-api.com/terms",
              "time_last_update_unix": 1721001601,
              "time_last_update_utc": "Mon, 15 Jul 2024 00:00:01 +0000",
              "time_next_update_unix": 1721088001,
              "time_next_update_utc": "Tue, 16 Jul 2024 00:00:01 +0000",
              "base_code": "USD",
              "conversion_rates": {
                "USD": 1,
                "AED": 3.6725,
                "AFN": 70.8133,
                "ALL": 92.1207,
                "AMD": 387.8659,
                "ANG": 1.79,
                "AOA": 879.5824,
                "ARS": 921.75,
                "AUD": 1.477,
                "AWG": 1.79,
                "AZN": 1.7001,
                "BAM": 1.796,
                "BBD": 2,
                "BDT": 117.4743,
                "BGN": 1.796,
                "BHD": 0.376,
                "BIF": 2881.833,
                "BMD": 1,
                "BND": 1.3423,
                "BOB": 6.9128,
                "BRL": 5.4297,
                "BSD": 1,
                "BTN": 83.563,
                "BWP": 13.4684,
                "BYN": 3.2652,
                "BZD": 2,
                "CAD": 1.3643,
                "CDF": 2850.43,
                "CHF": 0.8962,
                "CLP": 909.7325,
                "CNY": 7.2822,
                "COP": 3947.1032,
                "CRC": 522.9212,
                "CUP": 24,
                "CVE": 101.2514,
                "CZK": 23.2669,
                "DJF": 177.721,
                "DKK": 6.8518,
                "DOP": 59.0072,
                "DZD": 134.3268,
                "EGP": 47.95,
                "ERN": 15,
                "ETB": 57.7928,
                "EUR": 0.9183,
                "FJD": 2.2178,
                "FKP": 0.7714,
                "FOK": 6.8502,
                "GBP": 0.7714,
                "GEL": 2.7189,
                "GGP": 0.7714,
                "GHS": 15.4239,
                "GIP": 0.7714,
                "GMD": 67.9141,
                "GNF": 8514.7915,
                "GTQ": 7.7532,
                "GYD": 209.1954,
                "HKD": 7.8078,
                "HNL": 24.7485,
                "HRK": 6.9186,
                "HTG": 132.0451,
                "HUF": 359.8448,
                "IDR": 16120.3827,
                "ILS": 3.6098,
                "IMP": 0.7714,
                "INR": 83.5436,
                "IQD": 1311.5793,
                "IRR": 42048.8133,
                "ISK": 137.0692,
                "JEP": 0.7714,
                "JMD": 156.6725,
                "JOD": 0.709,
                "JPY": 158.3695,
                "KES": 129.0948,
                "KGS": 86.1124,
                "KHR": 4128.5364,
                "KID": 1.477,
                "KMF": 451.7517,
                "KRW": 1374.3334,
                "KWD": 0.3056,
                "KYD": 0.8333,
                "KZT": 474.0549,
                "LAK": 21952.7349,
                "LBP": 89500,
                "LKR": 301.5269,
                "LRD": 194.8035,
                "LSL": 17.9946,
                "LYD": 4.8505,
                "MAD": 9.8126,
                "MDL": 17.7294,
                "MGA": 4494.4237,
                "MKD": 56.5611,
                "MMK": 2102.7254,
                "MNT": 3432.8159,
                "MOP": 8.042,
                "MRU": 39.7642,
                "MUR": 46.7522,
                "MVR": 15.4245,
                "MWK": 1738.456,
                "MXN": 17.7022,
                "MYR": 4.6692,
                "MZN": 63.6895,
                "NAD": 17.9946,
                "NGN": 1564.4182,
                "NIO": 36.8653,
                "NOK": 10.7362,
                "NPR": 133.7008,
                "NZD": 1.6388,
                "OMR": 0.3845,
                "PAB": 1,
                "PEN": 3.7409,
                "PGK": 3.8575,
                "PHP": 58.3911,
                "PKR": 278.5105,
                "PLN": 3.9032,
                "PYG": 7489.5425,
                "QAR": 3.64,
                "RON": 4.5659,
                "RSD": 107.3754,
                "RUB": 87.8332,
                "RWF": 1315.2931,
                "SAR": 3.75,
                "SBD": 8.5015,
                "SCR": 14.4354,
                "SDG": 458.4516,
                "SEK": 10.5368,
                "SGD": 1.3426,
                "SHP": 0.7714,
                "SLE": 23.5047,
                "SLL": 23504.7229,
                "SOS": 571.2928,
                "SRD": 30.0078,
                "SSP": 2001.5259,
                "STN": 22.4972,
                "SYP": 12864.4068,
                "SZL": 17.9946,
                "THB": 36.1922,
                "TJS": 10.6863,
                "TMT": 3.5006,
                "TND": 3.1055,
                "TOP": 2.3284,
                "TRY": 33.0616,
                "TTD": 6.7748,
                "TVD": 1.477,
                "TWD": 32.4917,
                "TZS": 2658.7866,
                "UAH": 41.039,
                "UGX": 3686.7886,
                "UYU": 40.0458,
                "UZS": 12715.6889,
                "VES": 36.5243,
                "VND": 25452.8125,
                "VUV": 119.3028,
                "WST": 2.7234,
                "XAF": 602.3356,
                "XCD": 2.7,
                "XDR": 0.7549,
                "XOF": 602.3356,
                "XPF": 109.5772,
                "YER": 250.1952,
                "ZAR": 17.9937,
                "ZMW": 25.547,
                "ZWL": 13.7634
              }
            }
            """;
    public void mostrarMenuPrincipal(){
        String menuPrincipal = """
                1 - Listado de monedas
                2 - Realizar una conversión
                3 - Consultar historial de conversiones
                4 - Salir""";
        System.out.println(menuPrincipal);
    }

    public int leerOpcionPrincipal(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("\n------------------------------------------------------------------------------------------------------\n");
        return lectura.nextInt();
    }

    public void mostrarMenuMonedas(String moneda){
        System.out.println("------------------------------------------------------------------------------------------------------\n");
        System.out.println("Seleccione la moneda " + moneda + " a convertir : \n");
    }

    public String leerOpcionMoneda(){
        Scanner lectura = new Scanner(System.in);
        String opcion = lectura.nextLine().toLowerCase();
        while (!monedasDisponibles.toLowerCase().contains(opcion)) {
            System.out.println("**********************************************************************************");
            System.out.println("La opción selecciona no se encuentra disponible");
            System.out.println("Elija una opción válida, en caso de ser necesario revise la lista de monedas");
            System.out.println("**********************************************************************************\n");
            opcion = lectura.nextLine().toLowerCase();
        }
        return opcion.toUpperCase();
    }

    public Double leerCantidadACambiar(){
        System.out.println("------------------------------------------------------------------------------------------------------\n");
        System.out.println("Indique la cantidad que desea cambiar: \n");
        System.out.println("------------------------------------------------------------------------------------------------------\n");
        Scanner lectura = new Scanner(System.in);
        double cantidad;
        while (!lectura.hasNextDouble()) {
            System.out.println("**********************************************************************************");
            System.out.println("La cantidad indicada no es un número válido");
            System.out.println("Ingrese una cantidad que sea válida");
            System.out.println("**********************************************************************************");
            lectura.nextLine();
        }
        cantidad = lectura.nextDouble();
        lectura.nextLine();
        return cantidad;
    }

    public Double cantidadObtenida(String monedaBase, Double cantidadCambiar, Double tasaDeConversion, String monedaFinal){
        Double resultado = cantidadCambiar * tasaDeConversion;
        System.out.println("**********************************************************************************");
        System.out.println(cantidadCambiar + " " + monedaBase + " equivalen a: " + resultado + " " + monedaFinal);
        return resultado;
    }

    public void imprimirConversiones(ArrayList<Conversion> listaDeConversiones) {
        if (listaDeConversiones.isEmpty()) {
            System.out.println("\nHasta el momento no se han realizado conversiones.\n");
        } else {
            System.out.println("Historial de conversiones:");
            for (int i = 0; i < listaDeConversiones.size(); i++) {
                Conversion conversion = listaDeConversiones.get(i);
                System.out.println("Conversión número " + (i + 1) + ":");
                System.out.println("Moneda inicial: " + conversion.getMonedaBase());
                System.out.println("Moneda final: " + conversion.getMonedaObjetivo());
                System.out.println("Cantidad a cambiar: " + conversion.getCantidadACambiar());
                System.out.println("Cantidad obtenida: " + conversion.getCantidadEnMonedaObjetivo());
                System.out.println("Fecha y hora de la conversión: " + formatDateTime(conversion.getTiempo()));
                System.out.println("-----------------------------------------");
            }
        }
    }

    private String formatDateTime(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return dateTime.format(formatter);
    }
}
