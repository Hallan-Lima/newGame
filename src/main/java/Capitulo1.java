import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Capitulo1 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Funcoes funcoes = new Funcoes();
        funcoes.limparTela();
        System.out.println("\nVocê pode escolher o seu nome. Qual é o seu nome?");
        String nome = reader.readLine();

        // Cria o personagem do jogador
        Personagem personagem = new Personagem(nome, 10, 25, 25, 25, 25);

        // Imprime uma mensagem de boas-vindas
        System.out.println("\nBem-vindo ao jogo, " + nome + ".");
        System.out.println("O objetivo do jogo é que você evolua seu personagem e se prepare para o novo mundo.");
        System.out
                .println("Para isso, você deve completar tarefas e desafios que o ajudarão a aumentar seus atributos.");

        // Imprime um resumo dos atributos do personagem
        System.out.println("\nAqui estão os seus atributos iniciais:");
        System.out.println("Força: " + personagem.getForça());
        System.out.println("Inteligência: " + personagem.getInteligência());
        System.out.println("Carisma: " + personagem.getCarisma());
        System.out.println("Habilidade física: " + personagem.getHabilidadeFisica());

        // Imprime uma mensagem de encerramento
        System.out.println("\nBoa sorte em sua jornada!");

        // Imprime o título do capítulo
        System.out.println("** Capítulo 1: A Chegada **");

        // Imprime o texto do capítulo
        System.out.println("Você acorda em uma cama estranha. Você não se lembra de como chegou lá.");
        System.out.println("Você se levanta e olha ao redor. Você está em uma sala pequena e simples.");
        System.out.println("Há uma janela na parede. Você olha pela janela e vê um mundo que não reconhece.");
        System.out.println("Você não tem ideia do que fazer. Você está perdido e sozinho.");

        // Pede ao jogador para tomar uma decisão
        System.out.println("\nO que você faz?");

        // Lê a entrada do jogador
        String input = System.console().readLine();

        // Implementa a decisão do jogador
        switch (input) {
            case "Sair da sala":
                // ...
                break;
            case "Explorar a sala":
                // ...
                break;
            case "Procurar por pistas":
                // ...
                break;
            default:
                // ...
                break;
        }
    }
}
