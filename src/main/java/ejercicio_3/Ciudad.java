package ejercicio_3;

class Ciudad {
    private String nombre;
    private int poblacion;
    private double imp1;
    private double imp2;
    private double imp3;
    private double imp4;
    private double imp5;
    private double gastos;

    public Ciudad(String nombre, int poblacion, double imp1, double imp2, double imp3, double imp4, double imp5, double gastos) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        this.imp5 = imp5;
        this.gastos = gastos;
    }

    public double calcularRecaudacionTotal() {
        return imp1 + imp2 + imp3 + imp4 + imp5;
    }

    public boolean tieneDeficit() {
        return calcularRecaudacionTotal() < gastos;
    }

    public boolean esMayorDe100000Habitantes() {
        return poblacion > 100000;
    }

    public String getNombre() {
        return nombre;
    }
}
