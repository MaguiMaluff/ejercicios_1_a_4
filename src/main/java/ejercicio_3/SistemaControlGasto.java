package ejercicio_3;

import java.util.ArrayList;
import java.util.List;

public class SistemaControlGasto {
    private List<Provincia> provincias;

    public SistemaControlGasto() {
        provincias = new ArrayList<>();
    }

    public void agregarProvincia(Provincia provincia) {
        provincias.add(provincia);
    }

    public void mostrarCiudadesConDeficit() {
        for (Provincia provincia : provincias) {
            List<Ciudad> ciudadesConDeficit = provincia.obtenerCiudadesConDeficit();
            if (!ciudadesConDeficit.isEmpty()) {
                System.out.println("Ciudades con déficit en la provincia de " + provincia.getNombre() + ":");
                for (Ciudad ciudad : ciudadesConDeficit) {
                    System.out.println("- " + ciudad.getNombre());
                }
            }
        }
    }

    public void mostrarProvinciasConMasDeLaMitadDeCiudadesEnDeficit() {
        for (Provincia provincia : provincias) {
            if (provincia.tieneMasDeLaMitadDeCiudadesEnDeficit()) {
                System.out.println("La provincia de " + provincia.getNombre() + " tiene más de la mitad de sus ciudades en déficit.");
            }
        }
    }}
