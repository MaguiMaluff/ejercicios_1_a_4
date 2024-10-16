package ejercicio_3;

public class Main {

    public static void main(String[] args) {

    Ciudad ciudad1 = new Ciudad("Ciudad A", 150000, 50000, 30000, 20000, 15000, 10000, 160000);
    Ciudad ciudad2 = new Ciudad("Ciudad B", 200000, 80000, 50000, 25000, 20000, 15000, 180000);
    Ciudad ciudad3 = new Ciudad("Ciudad C", 90000, 60000, 40000, 30000, 25000, 10000, 70000);

    Provincia provincia1 = new Provincia("Mendoza");
    provincia1.agregarCiudad(ciudad1);
    provincia1.agregarCiudad(ciudad2);
    provincia1.agregarCiudad(ciudad3);

    SistemaControlGasto sistema = new SistemaControlGasto();
    sistema.agregarProvincia(provincia1);

    sistema.mostrarCiudadesConDeficit();
    sistema.mostrarProvinciasConMasDeLaMitadDeCiudadesEnDeficit();
}}
