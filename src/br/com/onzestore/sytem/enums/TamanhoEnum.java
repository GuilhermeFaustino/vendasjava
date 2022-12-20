package br.com.onzestore.sytem.enums;

import java.util.HashMap;
import java.util.Map;

public enum TamanhoEnum {
    P("P"),
    M("M"),
    G("G"),
    GG("GG"),
    XGG("XGG");
    private String cod;
    private static final Map<String, TamanhoEnum> getTamanho = new HashMap<>();

    static {
        for (TamanhoEnum tamanho : TamanhoEnum.values()){
            getTamanho.put(tamanho.getCod(), tamanho);
        }
    }
    public static TamanhoEnum getTamanhoEnum(String cod) {
        return getTamanho.get(cod);
    }

    TamanhoEnum(String cod){
        this.cod = cod;
    }

    public String getCod() {
        return cod;
    }
}