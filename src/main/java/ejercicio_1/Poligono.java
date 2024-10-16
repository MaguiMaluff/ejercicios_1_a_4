package org.example;
import java.util.ArrayList;

public class Poligono {
    private ArrayList<Lados> lados = new ArrayList<>();
    private String area;
    private Triangulo triangulo;
    private Cuadrilatero cuadrilatero;

    public Poligono() {}

    public Poligono(String area) {
        this.area = area;
    }

    public Lados getLados(int i) {
        return lados.get(i);
    }

    public void addLado(Lados lado) {
        this.lados.add(lado);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Triangulo getTriangulo() {
        return triangulo;
    }

    public void setTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }

    public Cuadrilatero getCuadrilatero() {
        return cuadrilatero;
    }

    public void setCuadrilatero(Cuadrilatero cuadrilatero) {
        this.cuadrilatero = cuadrilatero;
    }
}