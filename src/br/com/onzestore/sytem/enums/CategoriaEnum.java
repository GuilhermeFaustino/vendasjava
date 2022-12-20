package br.com.onzestore.sytem.enums;

import java.util.HashMap;
import java.util.Map;


public enum CategoriaEnum {

    CALCADOS("C"),
    ROUPAS("R"),
    PERFUMARIAS("P"),
    LINGERIE("L");
    private final String ref;

    private static final Map<String, CategoriaEnum> getCategoria = new HashMap<>();

    static {
        for (CategoriaEnum categoria: CategoriaEnum.values()){
            getCategoria.put(categoria.getRef(), categoria);
        }
    }



    public static CategoriaEnum getCategoria(String ref) {
        return getCategoria.get(ref);
    }

    CategoriaEnum(String c){
        this.ref = c;
    }


    public String getRef(){
        return ref;
    }
}