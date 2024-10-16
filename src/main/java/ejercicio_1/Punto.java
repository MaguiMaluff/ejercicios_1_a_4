package org.example;

public class Punto {
    private int x;
    private  int y;


    // GET AND SET
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    // CONSTRUCTORES
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
    }
}