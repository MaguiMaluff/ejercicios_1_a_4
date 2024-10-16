package org.example;

import java.util.ArrayList;

public class Continente {
    private String nombre;
    private ArrayList<Pais> paises = new ArrayList<>();

    public Continente() {
    }

    public Continente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPaises(int i) {
        return paises.get(i);
    }

    public void setPais(Pais pais) {
        this.paises.add(pais) ;
    }

}
