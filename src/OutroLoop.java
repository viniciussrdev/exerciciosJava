import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);  // Cria um objeto Scanner para ler entrada do usuário
        double mediaAvaliacao = 0;  // Variável para armazenar a soma das avaliações
        double nota = 0;  // Variável para armazenar cada nota digitada pelo usuário
        int totalDeNotas = 0;  // Variável para contar o total de notas inseridas

        while (nota != -1) {  // Enquanto a nota não for -1, continua o loop
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar  ");  // Solicita ao usuário que diga sua avaliação ou -1 para encerrar
            nota = leitura.nextDouble();  // Lê a nota digitada pelo usuário

            if (nota != -1) {  // Se a nota não for -1 (ou seja, se não for para encerrar)
                mediaAvaliacao += nota;  // Adiciona a nota à soma das avaliações
                totalDeNotas++;  // Incrementa o contador de notas
            }
        }

        System.out.println("Média de avaliações " + mediaAvaliacao / totalDeNotas);  // Calcula e exibe a média das avaliações
    }
}
