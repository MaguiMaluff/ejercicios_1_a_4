package org.example;

public class Cuadrilatero extends Poligono{
    private int base;
    private int altura;


    public Cuadrilatero(int base, int altura) {
        super("base * altura");  // Fórmula del área del Cuadrilatero
        this.base = base;
        this.altura = altura;
    }

    // GET AND SET
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}