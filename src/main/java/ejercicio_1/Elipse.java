package org.example;

import org.example.Circulo;


public class Elipse {
    private String area;
    private Circulo circulo;

    public Elipse(String area) {
        this.area = area;
    }

    public Elipse() {
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Circulo getCirculo() {
        return circulo;
    }

    public void setCirculo(Circulo circulo) {
        this.circulo = circulo;
    }

}