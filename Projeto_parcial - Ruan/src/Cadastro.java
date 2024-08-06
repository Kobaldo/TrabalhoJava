import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    Scanner scanner = new Scanner(System.in);
    BancoDeDados bancoDeDados = new BancoDeDados();
    Jogadores jogador = new Jogadores();

    void adicionarJogador(){
        List<String[]> lista = new ArrayList<>();

        //Insira seu código aqui

        jogador.inserirJogador(lista);
        bancoDeDados.close();
    }

    void lerJogador(){
        //Insira seu código aqui
    }

    void deletarJogador(){
        //Insira seu código aqui
    }

    void imprimirMenu(){
        System.out.println("Escolha uma opção:");
        System.out.println("1- Inserir jogador");
        System.out.println("2- Consultar jogador");
        System.out.println("3- Deletar jogador");
        System.out.println("4- Sair");
    }
}
