package com.aluracursos.convetidor_monedas.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;

public class ListadoMonedas extends LectorListaMonedas {

    public void lista() {

        // Ruta al archivo JSON
        String filePath = "src/com/aluracursos/convetidor_monedas/ListaMonedas.json";

        try (Reader reader = new FileReader(filePath)) {
            // Instancia GSON
            Gson gson = new Gson();
            // Definir el tipo de dato a deserializar con GSON
            Type listType = new TypeToken<List<LectorListaMonedas>>() {}.getType();
            // Leer el JSON y convertirlo a una lista de objetos
            List<LectorListaMonedas> listaModendas = gson.fromJson(reader, listType);

            LectorListaMonedas monedaBuscada = null;

            // Iterar sobre listaMonedas y encontrar la monedaBuscada
            for (LectorListaMonedas monedaCode : listaModendas) {
                System.out.println(monedaCode.getCurrencyCode() +
                        " - " + monedaCode.getCurrencyName() +
                        " - " + monedaCode.getCountry());
            }
            System.out.println("------------------------------------------------------------------------------------------------------\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
