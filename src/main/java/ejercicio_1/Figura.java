package org.example;

public class Figura {
    private String color;
    private Poligono poligono;
    private Elipse elipse;

    public Figura(String color, Poligono poligono, Elipse elipse) {
        this.color = color;
        this.poligono = poligono;
        this.elipse = elipse;
    }

    public Figura(String color) {
        this.color = color;
    }

    public Figura(Poligono poligono) {
        this.poligono = poligono;
    }

    public Figura(Elipse elipse) {
        this.elipse = elipse;
    }

    public Figura() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Poligono getPoligono() {
        return poligono;
    }

    public void setPoligono(Poligono poligono) {
        this.poligono = poligono;
    }

    public Elipse getElipse() {
        return elipse;
    }

    public void setElipse(Elipse elipse) {
        this.elipse = elipse;
    }
}