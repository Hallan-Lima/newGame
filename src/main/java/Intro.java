import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Intro {

        public static void main(String[] args) throws Exception {

                Funcoes funcoes = new Funcoes();
                funcoes.limparTela();

                // Cria um leitor de entrada padrão
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                // Imprime a introdução do jogo
                System.out.println("** Introdução **");
                System.out.println(
                                "O ano é 2350. A sociedade está dividida em dois grupos: os que nasceram antes da equalização e os que nasceram depois.");
                System.out.println(
                                "Você é um jovem que nasceu depois da equalização. Você foi criado por robôs até os 10 anos de idade.");
                System.out.println("Agora, você está pronto para ser lançado no mundo.");
                System.out.println("** Objetivo **");
                System.out.println(
                                "O objetivo do jogo é que você evolua seu personagem e se prepare para o novo mundo.");
                System.out.println(
                                "Para isso, você deve completar tarefas e desafios que o ajudarão a aumentar seus atributos.");
                System.out.println("** Atributos **");
                System.out.println("Você tem quatro atributos: força, inteligência, carisma e habilidade física.");
                System.out.println("Você pode aumentar seus atributos completando tarefas e desafios.");
                System.out.println("** Tutorial **");
                System.out.println("Para jogar, siga as instruções na tela.");
                System.out.println("Você pode usar o teclado para digitar suas respostas.");
                System.out.println("** Boa sorte! **");
                boolean a = true;
                while (a) {
                        System.out.println("Vamos começar?");
                        System.out.println("S - sim");
                        System.out.println("N - Não");
                        System.out.print("R:");
                        String input = reader.readLine();
                        input.toLowerCase();
                        if (input.equals("s")) {
                                a = false;
                        }
                        if (input.equals("n")) {
                                System.exit(0);
                        }
                }
        }
}
