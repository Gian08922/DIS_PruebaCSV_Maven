package com.pruebaCSV;

/*
    Ejemplo muy sencillo de acceso a un archivo .csv desde java
    NO UTLIZA ningun gestor de dependencias
 */

public class PruebaCSV {
    /**
     * @author Giancarlo Rios
     */


    public static void main(String[] args) {
        LectorCSV miLector = new LectorCSV();
        miLector.leeCSV("./src/main/resources/datos/pokemon.csv");
    }
}
