package ejercicio_4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> mineralesLote1 = new HashSet<>();
        mineralesLote1.add("Nitrógeno");
        mineralesLote1.add("Fósforo");
        mineralesLote1.add("Potasio");

        Lote lote1 = new Lote("Lote 1", mineralesLote1, true, false);

        Set<String> mineralesMaiz = new HashSet<>();
        mineralesMaiz.add("Nitrógeno");
        mineralesMaiz.add("Fósforo");

        Set<String> mineralesTrigo = new HashSet<>();
        mineralesTrigo.add("Nitrógeno");
        mineralesTrigo.add("Potasio");

        Set<String> mineralesAlfalfa = new HashSet<>();
        mineralesAlfalfa.add("Fósforo");
        mineralesAlfalfa.add("Potasio");

        Cereal maiz = new GranoCosechaGruesa("Maíz", mineralesMaiz);
        Cereal trigo = new GranoCosechaFina("Trigo", mineralesTrigo);
        Cereal alfalfa = new Pastura("Alfalfa", mineralesAlfalfa);

        Set<Cereal> cereales = new HashSet<>();
        cereales.add(maiz);
        cereales.add(trigo);
        cereales.add(alfalfa);

        // Crear el sistema de la cooperativa y recomendar cereales para el lote
        SistemaCooperativa sistema = new SistemaCooperativa();
        sistema.recomendarCerealParaLote(lote1, cereales);
    }
}

