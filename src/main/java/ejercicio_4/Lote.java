package ejercicio_4;

import java.util.Set;

class Lote {
    private String nombre;
    private Set<String> minerales;
    private boolean esEspecial;
    private boolean pasturaSembradaPreviamente;

    public Lote(String nombre, Set<String> minerales, boolean esEspecial, boolean pasturaSembradaPreviamente) {
        this.nombre = nombre;
        this.minerales = minerales;
        this.esEspecial = esEspecial;
        this.pasturaSembradaPreviamente = pasturaSembradaPreviamente;
    }

    public boolean contieneMineralesRequeridos(Set<String> mineralesRequeridos) {
        return minerales.containsAll(mineralesRequeridos);
    }

    public boolean isEspecial() {
        return esEspecial;
    }

    public boolean isPasturaSembradaPreviamente() {
        return pasturaSembradaPreviamente;
    }

    public String getNombre() {
        return nombre;
    }
}