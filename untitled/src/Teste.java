import java.util.Scanner;

public class Teste {
        public static void main(String[] args){
            int valor = 0;
            int resposta = 0;
            String pesquisa;

            Scanner teclado = new Scanner(System.in);
            Controle ctr = new Controle();

            ctr.cadastroInfo("produto numero um",
                    "descricao linda do produto um",
                    "discotech",
                    "java");
            ctr.cadastroInfo("produto numero dois",
                    "descricao linda do produto dois",
                    "discotech",
                    "oracle");
            ctr.cadastroInfo("produto numero tres",
                    "descricao linda do produto tres",
                    "infomtech",
                    "java e oracle");
            ctr.cadastroInfo("produto numero quatro",
                    "descricao linda do produto quatro",
                    "infomtech",
                    "java");
            ctr.cadastroInfo("produto numero cinco",
                    "descricao linda do produto cinco",
                    "vavatech",
                    "oracle");
            ctr.cadastroInfo("produto numero seis",
                    "descricao linda do produto seis",
                    "vavatech",
                    "java e oracle");
            ctr.cadastroInfo("produto numero sete",
                    "descricao linda do produto sete",
                    "vavatech",
                    "java");
            ctr.cadastroInfo("produto numero oito",
                    "descricao linda do produto oito",
                    "mercadotech",
                    "oracle");

            while(valor != 9){
                System.out.println("1 - Definir filtro tecnologia: \n" +
                        "2 - Definir filtro mercado: \n" +
                        "3 - Pesquisar por nome: \n" +
                        "9 - Sair ");
                valor = teclado.nextInt();
                if(valor == 1){
                    System.out.println("1 - Java \n" +
                            "2 - Oracle \n");
                    resposta = teclado.nextInt();
                    System.out.println(ctr.filtroTecnologia(resposta));
                }else if(valor == 2){
                    System.out.println("1 - discotech \n" +
                            "2 - infomtech \n" +
                            "3 - vavatech \n" +
                            "4 - mercadotech");
                    resposta = teclado.nextInt();
                    System.out.println(ctr.filtroMercado(resposta));
                }else if(valor == 3){
                    System.out.println("Digite o nome para pesquisa: ");
                    teclado.nextLine();
                    pesquisa = teclado.nextLine();
                    System.out.println(ctr.pesquisarProduto(pesquisa));
                }
            }

        }
}
