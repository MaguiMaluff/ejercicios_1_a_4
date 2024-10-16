package ejercicio_3;

import java.util.ArrayList;
import java.util.List;

class Provincia {
    private String nombre;
    private List<Ciudad> ciudades;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public void agregarCiudad(Ciudad ciudad) {
        ciudades.add(ciudad);
    }

    public List<Ciudad> obtenerCiudadesConDeficit() {
        List<Ciudad> ciudadesConDeficit = new ArrayList<>();
        for (Ciudad ciudad : ciudades) {
            if (ciudad.esMayorDe100000Habitantes() && ciudad.tieneDeficit()) {
                ciudadesConDeficit.add(ciudad);
            }
        }
        return ciudadesConDeficit;
    }

    public boolean tieneMasDeLaMitadDeCiudadesEnDeficit() {
        int totalCiudadesDeficit = 0;
        int totalCiudades = 0;

        for (Ciudad ciudad : ciudades) {
            if (ciudad.esMayorDe100000Habitantes()) {
                totalCiudades++;
                if (ciudad.tieneDeficit()) {
                    totalCiudadesDeficit++;
                }
            }
        }

        return totalCiudades > 0 && totalCiudadesDeficit > totalCiudades / 2;
    }

    public String getNombre() {
        return nombre;
    }
}