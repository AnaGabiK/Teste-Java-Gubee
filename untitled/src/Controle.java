import java.util.ArrayList;

public class Controle {
    private ArrayList<Produto> listaProdutos;
    public Controle() {
        listaProdutos = new ArrayList<>();
    }

    public void cadastroInfo(String nome, String descricao, String mercado, String tecnologia) {
        Produto produto = new Produto(nome, descricao, mercado, tecnologia);
        listaProdutos.add(produto);
    }

    public String pesquisarProduto(String nome) {
        Produto produto;
        String pesquisa = "";
        String nomeProd = "";
        for (int i = 0; i < listaProdutos.size(); i++) {
            produto = listaProdutos.get(i);
            nomeProd = produto.getNome();
            if(nomeProd.contains(nome)){
                pesquisa = pesquisa + "[  " + produto.getNome() + "\n" +
                produto.getDescricao() + "\n" +
                produto.getMercado() + "\n" +
                produto.getTecnologia() + "  ]" + "\n\n";
            }
        }
        return pesquisa;
    }

    public String filtroTecnologia(int resposta) {
        Produto produto;
        String pesquisa = "";
        String tecnoProd = "";
        String tecnologia = "";
        if(resposta == 1){
            tecnologia = "java";
        }else if(resposta == 2){
            tecnologia = "oracle";
        }
        for (int i = 0; i < listaProdutos.size(); i++) {
            produto = listaProdutos.get(i);
            tecnoProd = produto.getTecnologia();
            if(tecnoProd.contains(tecnologia)){
                pesquisa = pesquisa + "[  " + produto.getNome() + "\n" +
                        produto.getDescricao() + "\n" +
                        produto.getMercado() + "\n" +
                        produto.getTecnologia() + "  ]" + "\n\n";
            }
        }
        return pesquisa;
    }

    public String filtroMercado(int resposta) {
        Produto produto;
        String pesquisa = "";
        String mercProd = "";
        String mercado = "";
        if(resposta == 1){
            mercado = "discotech";
        }else if(resposta == 2){
            mercado = "infomtech";
        } else if(resposta == 3){
            mercado = "vavatech";
        }else if(resposta == 4){
            mercado = "mercadotech";
        }
        for (int i = 0; i < listaProdutos.size(); i++) {
            produto = listaProdutos.get(i);
            mercProd = produto.getMercado();
            if(mercProd.contains(mercado)){
                pesquisa = pesquisa + "[  " + produto.getNome() + "\n" +
                        produto.getDescricao() + "\n" +
                        produto.getMercado() + "\n" +
                        produto.getTecnologia() + "  ]" + "\n\n";
            }
        }
        return pesquisa;
    }
}

