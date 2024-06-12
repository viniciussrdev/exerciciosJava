import java.util.Scanner;  // Importa a classe Scanner, que é usada para ler a entrada do usuário

public class LeituraDados {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);  // Cria um objeto Scanner para ler a entrada do usuário

        // Solicita ao usuário que insira seu filme favorito
        System.out.println("Filme favorito: ");
        String filme = leitura.nextLine();  // Lê a linha completa digitada pelo usuário e armazena na variável 'filme'

        // Solicita ao usuário que insira o ano de lançamento do filme
        System.out.println("Ano de lançamento: ");
        int anoDeLancamento = leitura.nextInt();  // Lê o próximo número inteiro digitado pelo usuário e armazena na variável 'anoDeLancamento'

        // Solicita ao usuário que insira a nota do filme
        System.out.println("Nota do Filme: ");
        double nota = leitura.nextDouble();  // Lê o próximo número de ponto flutuante digitado pelo usuário e armazena na variável 'nota'

        // Exibe o filme escolhido pelo usuário
        System.out.println("Filme escolhido: " + filme);

        // Exibe o ano de lançamento do filme
        System.out.println("Lançado no ano de " + anoDeLancamento);

        // Exibe a avaliação da crítica com a nota fornecida
        System.out.println("Avaliação da crítica: Nota " + nota);
    }
}
