//ex9aula5
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        String continuar;
        double totalCompra = 0; // acumulador do valor total

        do {
            System.out.println("--------- Cardápio lanchonete---------");
            System.out.println("=======================================");
            System.out.println("CÓDIGO: | PRODUTO:          |   PREÇO: ");
            System.out.println("100     | Cachorro quente   |    R$1,20 ");
            System.out.println("101     | Bauru simples     |    R$1,30 ");
            System.out.println("102     | Bauru c/ ovo      |    R$1,50 ");
            System.out.println("103     | Hamburguer        |    R$1,20 ");
            System.out.println("104     | Cheeseburguer     |    R$1,30 ");
            System.out.println("105     | Refrigerante      |    R$1,00 ");
            System.out.println("=======================================");

            System.out.print("Digite o código do produto desejado: ");
            int codigoprod = e.nextInt();

            System.out.print("Qual a quantidade do produto desejada? ");
            int quantidade = e.nextInt();

            double preco = 0;
            String produto = "";

            switch (codigoprod) {
                case 100:
                    preco = quantidade * 1.20;
                    produto = "Cachorro quente";
                    break;
                case 101:
                    preco = quantidade * 1.30;
                    produto = "Bauru simples";
                    break;
                case 102:
                    preco = quantidade * 1.50;
                    produto = "Bauru c/ ovo";
                    break;
                case 103:
                    preco = quantidade * 1.20;
                    produto = "Hamburguer";
                    break;
                case 104:
                    preco = quantidade * 1.30;
                    produto = "Cheeseburguer";
                    break;
                case 105:
                    preco = quantidade * 1.00;
                    produto = "Refrigerante";
                    break;
                default:
                    System.out.println("Erro! Código inválido.");
            }

            if (!produto.isEmpty()) {
                System.out.printf("Você comprou %d %s(s). Valor: R$ %.2f%n", quantidade, produto, preco);
                totalCompra += preco;
            }

            System.out.print("Deseja comprar alguma coisa a mais? (s/n): ");
            continuar = e.next();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.printf("Valor total da compra: R$ %.2f%n", totalCompra);
        System.out.println("Obrigado pela compra!");
        e.close();
    }
}