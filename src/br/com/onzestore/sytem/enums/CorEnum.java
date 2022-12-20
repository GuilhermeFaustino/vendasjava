package br.com.onzestore.sytem.enums;

import java.util.HashMap;
import java.util.Map;

public enum CorEnum {

    AZUL("AZ", "azul caneta"),
    VERDE("VD", "verde agua"),
    VERMELHO("VR", "vermelho queimado"),
    AMARELO("AM", "amarelo claro"),
    PRETO("PR", "preto fosco"),
    BRANCO("BC", "branco ice");

    String cor;
    String desc;

    private static final Map<String, CorEnum> getCor = new HashMap<>();

    static {
        for (CorEnum cor: CorEnum.values()){
            getCor.put(cor.getCor(), cor);
        }
    }


    public static CorEnum getCorEnum(String cor) {
        return getCor.get(cor);
    }

    CorEnum(String cor, String desc){
        this.cor = cor;
        this.desc = desc;
    }

    public String getCor() {
        return cor;
    }

    public String getDesc(){
        return desc;
    }

}