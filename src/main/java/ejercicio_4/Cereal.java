package ejercicio_4;

import java.util.Set;

abstract class Cereal {
    private String nombre;
    protected Set<String> mineralesRequeridos;

    public Cereal(String nombre, Set<String> mineralesRequeridos) {
        this.nombre = nombre;
        this.mineralesRequeridos = mineralesRequeridos;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract boolean sePuedeSembrarEn(Lote lote);
}