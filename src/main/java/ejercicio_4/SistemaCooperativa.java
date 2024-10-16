package ejercicio_4;

import java.util.Set;

public class SistemaCooperativa {
    public void recomendarCerealParaLote(Lote lote, Set<Cereal> cereales) {
        System.out.println("Recomendaciones para el lote: " + lote.getNombre());
        for (Cereal cereal : cereales) {
            if (cereal.sePuedeSembrarEn(lote)) {
                System.out.println("- Se puede sembrar: " + cereal.getNombre());
            }
        }
    }
}