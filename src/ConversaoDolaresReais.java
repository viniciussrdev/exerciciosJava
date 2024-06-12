public class ConversaoDolaresReais {
    public static void main(String[] args) {
        double valorEmDolares = 500;  // Define o valor em dólares
        double taxaDeConversao = 5.37;  // Define a taxa de conversão para reais

        double valorEmReais = valorEmDolares * taxaDeConversao;  // Calcula o valor em reais

        System.out.println("Valor em reais (R$): " + valorEmReais);  // Exibe o valor em reais
    }
}