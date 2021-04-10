package pooflix.parcial.aplicacion;


import dominio.Material;
import dominio.Pooflix;

import java.util.ArrayList;
import java.util.Arrays;

public class Aplicacion {
    public static void main(String[] args) {

        Pooflix miSistema = new Pooflix(15);
        Material pelicula = new Material(12,"A ya casi",60,"pelicula");
        Material pelicula2 = new Material(13,"termino",60,"pelicula");
        Material pelicula3 = new Material(14,"esto",60,"pelicula");

        miSistema.getListaMaterial().addAll(Arrays.asList(pelicula,pelicula2,pelicula3));
        miSistema.buscarMaterialPorTipo("pelicula");
        miSistema.duracionTotal(12);



    }
}
