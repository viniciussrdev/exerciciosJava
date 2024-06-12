public class CalculoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 150.0;  // Define o preço original

        double percentualDesconto = 10.0;  // Define o percentual de desconto
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;  // Calcula o valor do desconto
        double novoPreco = precoOriginal - valorDesconto;  // Calcula o novo preço com o desconto

        System.out.println("Preço original: R$" + precoOriginal);  // Exibe o preço original
        System.out.println("Desconto: R$" + valorDesconto);  // Exibe o valor do desconto
        System.out.println("Novo preço com desconto: R$" + novoPreco);  // Exibe o novo preço com o desconto
    }
}