import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

        // Calcula o fatorial do número digitado pelo usuário
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        // Exibe o fatorial calculado
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
