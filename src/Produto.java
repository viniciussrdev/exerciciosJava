public class Produto {
    public static void main(String[] args) {

        double precoProduto = 85.99;  // Define o preço do produto
        int qtdProduto = 3;  // Define a quantidade de produtos

        double total = precoProduto * qtdProduto;  // Calcula o valor total da compra

        String mensagem = "O valor total da compra é R$" + total;  // Cria uma mensagem com o valor total

        System.out.println(mensagem);  // Exibe a mensagem
    }
}