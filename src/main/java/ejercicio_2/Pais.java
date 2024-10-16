package org.example;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private Ciudad capital;
    private ArrayList<Provincia> provincias = new ArrayList<>();
    private ArrayList<Pais> paisesLimite = new ArrayList<>();
    private ArrayList<Provincia> provinciasLimite = new ArrayList<>();

    public Pais(){}

    public Pais(String nombre, Ciudad capital) {
        this.nombre = nombre;
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCapital() {
        return capital;
    }

    public void setCapital(Ciudad capital) {
        this.capital = capital;
    }

    public Pais getPaises(int i) {
        return paisesLimite.get(i);
    }

    public void setPaiseLimite(Pais pais) {
        this.paisesLimite.add(pais) ;
    }

    public Provincia getProvinciaLimite(int i) {
        return provinciasLimite.get(i);
    }

    public void setProvLimite(Provincia provincia) {
        this.provinciasLimite.add(provincia);
    }

    public Provincia getProvincia(int i) {
        return provincias.get(i);
    }

    public void setProvincia(Provincia provincia) {
        this.provincias.add(provincia);
    }
}
