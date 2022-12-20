package br.com.onzestore.sytem.enums;

import java.util.HashMap;
import java.util.Map;

public enum DepartamentoEnum {

    MACULINO("MAS", 1, 'A'),
    FEMININO("FEM", 2, 'B'),
    INFANTIL("INF", 3, 'C'),
    INFANTOJUVENIL("JUV", 4, 'D');

    private final static Map<String, DepartamentoEnum> mapa = new HashMap<>();

    static {
        for (DepartamentoEnum departamento : DepartamentoEnum.values() ){
            mapa.put(departamento.getCod(), departamento);
        }
    }

    private  String cod;
    private int andar;
    private char sessao;

    DepartamentoEnum(String cod, int andar, char sessao){
        this.cod = cod;
        this.andar = andar;
        this.sessao = sessao;
    }
    public String getCod(){
        return cod;
    }
    public int getAndar(){
        return andar;
    }

    public char getSessao(){
        return sessao;
    }

    public static DepartamentoEnum getDept(String cod){
        return mapa.get(cod);
    }
}