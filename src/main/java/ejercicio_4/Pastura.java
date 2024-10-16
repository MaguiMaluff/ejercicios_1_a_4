package ejercicio_4;

import java.util.Set;

class Pastura extends Cereal {
    public Pastura(String nombre, Set<String> mineralesRequeridos) {
        super(nombre, mineralesRequeridos);
    }

    @Override
    public boolean sePuedeSembrarEn(Lote lote) {
        return lote.contieneMineralesRequeridos(mineralesRequeridos) && !lote.isPasturaSembradaPreviamente();
    }
}