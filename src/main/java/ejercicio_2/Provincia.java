package org.example;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Ciudad> ciudades = new ArrayList<>();
    private ArrayList<Provincia> provinciasLimite = new ArrayList<>();

    public Provincia() {
    }

    public Provincia(String name) {
        this.nombre = name;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad(int i) {
        return ciudades.get(i);
    }

    public void setCiudades(Ciudad ciudad) {
        this.ciudades.add(ciudad);
    }


    public Provincia getProvinciaLimite(int i) {
        return provinciasLimite.get(i);
    }

    public void setProvLimite(Provincia provincia) {
        this.provinciasLimite.add(provincia);
    }
}
