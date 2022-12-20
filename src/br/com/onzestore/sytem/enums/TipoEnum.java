package br.com.onzestore.sytem.enums;

import java.util.HashMap;
import java.util.Map;
public enum TipoEnum {
    NACIONAL("N"),
    IMPORTADO("I"),
    BRAS("B");

    private static final Map<String, TipoEnum> getTipo = new HashMap<>();

    static {
        for (TipoEnum tipo : TipoEnum.values()){
            getTipo.put(tipo.getCod(), tipo);
        }
    }
    public static TipoEnum getTipoEnum(String cod) {
        return getTipo.get(cod);
    }
    String cod;
    TipoEnum(String cod){
        this.cod = cod;
    }
    public String getCod() {
        return cod;
    }
}
