package dominio;

import java.util.ArrayList;


public class Pooflix {
    public int capacidad;
    private ArrayList<Material> listaMaterial;

    public Pooflix(int capacidad) {
        this.capacidad = capacidad;
        listaMaterial = new ArrayList<>();

    }

    public int getCapacidad() {
        return capacidad;
    }

    public ArrayList<Material> getListaMaterial() {
        return listaMaterial;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setListaMaterial(ArrayList<Material> listaMaterial) {
        listaMaterial = new ArrayList<>();
    }


    public boolean agregarMaterial(int idMaterial) {
        int aumentarMaterial;
        for (int i = 0; i < listaMaterial.size(); i++) {
            if (idMaterial == listaMaterial.get(i).getCodigo()) {
                if (listaMaterial.get(i).getCodigo() < 15) {
                    aumentarMaterial = listaMaterial.get(i).getCodigo();
                    aumentarMaterial = listaMaterial.size() + 1;
                    return true;
                }

            }

        }
        return false;
    }

    public boolean retirarMaterial(int idMaterial) {

        int sacarMaterial;
        for (int i = 0; i < listaMaterial.size(); i++) {
            if (idMaterial == listaMaterial.get(i).getCodigo()) {
                if (listaMaterial.get(i).getCodigo() != 0) {
                    sacarMaterial = listaMaterial.get(i).getCodigo();
                    sacarMaterial = sacarMaterial - 1;
                    listaMaterial.get(i).setCodigo(sacarMaterial);
                    return true;
                }

            }
        }

        return false;
    }

    public void buscarMaterial(int idMaterial) {
        listaMaterial.forEach(material ->
        {
            if (idMaterial == material.getCodigo()) {

                System.out.println("El material buscado es: " + material.getNombre() + "con el código: " + material.getCodigo());
            } else {
                System.out.println("El codigo ingresado no se encuentra registrado");
            }
        });


    }

    public void buscarMaterial(String nombre) {
        listaMaterial.forEach(material ->
        {
            if (nombre == material.getNombre()) {

                System.out.println("El material buscado es: " + material.getNombre() + "con el código: " + material.getCodigo());
            } else {
                System.out.println("El nombre ingresado no se encuentra registrado");
            }
        });
    }

    public void buscarMaterialPorTipo(String tipo) {
        listaMaterial.forEach(material -> {

            {
                if (tipo == material.getTipo()) {

                    System.out.println("El tipo buscado es: " + material.getTipo() + "; Contiene: " + material.getNombre()
                    );
                } else {
                    System.out.println("El tipo ingresado no se encuentra registrado");
                }

            }

        });

    }

    public void duracionTotal(int idMaterial) {

        int duracionTotal;
        for (int i = 0; i < listaMaterial.size(); i++) {
            if (idMaterial == listaMaterial.get(i).getCodigo()) {
                if (listaMaterial.get(i).getDuracion() != 0) {
                    duracionTotal = listaMaterial.get(i).getDuracion();
                    duracionTotal = duracionTotal / 60;
                    System.out.println("La duración del material es de " + duracionTotal + " hora");


                }

            }


        }
    }
}
