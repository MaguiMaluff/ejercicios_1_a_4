package org.example;

import java.sql.SQLOutput;
import org.example.Triangulo;
import org.example.Cuadrilatero;
import org.example.Lados;
import org.example.Circulo;
import org.example.Poligono;
import org.example.Figura;
import org.example.Rectangulo;
import org.example.Elipse;
import org.example.Cuadrado;

public class Main {

    public static void main(String[] args) {
        // Creando un triángulo con base 10 y altura 5
        Triangulo t1 = new Triangulo(10, 5);
        t1.addLado(new Lados(10));
        t1.addLado(new Lados(8));
        t1.addLado(new Lados(7));


        Cuadrilatero c1 = new Cuadrilatero(10, 2);
        c1.addLado(new Lados(10));
        c1.addLado(new Lados(2));
        c1.addLado(new Lados(2));
        c1.addLado(new Lados(10));

        Circulo circulo1 = new Circulo(4);


        System.out.println("La formulad de área del triángulo es: " + t1.getArea());

        //Creo Cuadrilatero
        System.out.println("La altura es" + c1.getAltura());
        System.out.println("La formula de area del cuadrilatero es: " + c1.getArea());

        //Creo Circulo
        System.out.println("La formula de area del circulo es: " + circulo1.getArea() );
        System.out.println("El radio del circulo es: " + circulo1.getRadio() );

        System.out.println("----------------------------------------------------------------------");
        // Creo Triangulo a partir de Poligono
        Triangulo triangulo2 = new Triangulo(3,10);
        Cuadrilatero cuadrilatero2 = new Cuadrilatero(2, 4);
        Poligono poligono2 = new Poligono("");
        poligono2.setTriangulo(triangulo2);
        System.out.println("El área del triángulo es: " + poligono2.getTriangulo().getArea());

        Poligono poligono3 = new Poligono("");
        poligono3.setCuadrilatero(cuadrilatero2);
        System.out.println("El área del cuadrilatero es: " + poligono3.getCuadrilatero().getArea());

        //Inserto Circulo a traves de Elipse
        Circulo circulo4 = new Circulo(3);
        Elipse elipse4 = new Elipse("");
        elipse4.setCirculo(circulo4);
        System.out.println("La formula de area del circulo es: " + elipse4.getCirculo().getArea());
        System.out.println("El radio del circulo es: " + elipse4.getCirculo().getRadio());


        //
        Cuadrado cuadrado2 = new Cuadrado(5);
        Rectangulo rectangulo2 = cuadrado2;
        System.out.println("La altura del cuadrado es: " + rectangulo2.getAltura());

    }



}