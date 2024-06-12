import java.util.Scanner;

public class LoopMedia {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);  // Cria um objeto Scanner para ler entrada do usuário
        double mediaNotas = 0;  // Variável para armazenar a soma das notas
        double nota = 0;  // Variável para armazenar cada nota digitada pelo usuário

        for (int i = 0; i < 3 ; i++) {  // Loop que executa 3 vezes

            System.out.println("Dê uma nota ao filme: ");  // Solicita ao usuário que dê uma nota ao filme
            nota = leitura.nextDouble();  // Lê a nota digitada pelo usuário
            mediaNotas += nota;  // Adiciona a nota à soma das notas
        }

        System.out.println("Média das avaliações: " + mediaNotas / 3);  // Calcula e exibe a média das notas
    }
}
