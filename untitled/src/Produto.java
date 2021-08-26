import java.util.ArrayList;

public class Produto {
    private String nome;
    private String descricao;
    private String mercado;
    private String tecnologia;

    public Produto(String nome, String descricao, String mercado, String tecnologia){
        this.nome = nome;
        this.descricao = descricao;
        this.mercado = mercado;
        this.tecnologia = tecnologia;
    }
    public String getNome(){
        return nome;
    }
    public String getDescricao(){
        return descricao;
    }
    public String getMercado(){
        return mercado;
    }
    public String getTecnologia(){
        return tecnologia;
    }
}
