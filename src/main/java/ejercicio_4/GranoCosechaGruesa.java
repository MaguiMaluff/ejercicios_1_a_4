package ejercicio_4;

import java.util.Set;

class GranoCosechaGruesa extends Cereal {
    public GranoCosechaGruesa(String nombre, Set<String> mineralesRequeridos) {
        super(nombre, mineralesRequeridos);
    }

    @Override
    public boolean sePuedeSembrarEn(Lote lote) {
        return lote.contieneMineralesRequeridos(mineralesRequeridos);
    }
}