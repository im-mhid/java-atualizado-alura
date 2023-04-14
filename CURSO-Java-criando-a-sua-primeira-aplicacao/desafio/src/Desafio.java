import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome = "Matheus Henrique";
        String tipoConta = "Corrente";
        double saldo = 2000;
        int opcao = 0;

        System.out.println("*********************************************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo atual: "+saldo);
        System.out.println("\n*********************************************************");

        String msgMenu = """
                ** Digite sua opção **
                1- Sacar
                2- Depositar
                3- Consultar saldo
                4- Sair
                """;

        do {
            System.out.println(msgMenu);
            opcao = ler.nextInt();

            if(opcao == 1) {
                System.out.println("Valor a sacar:");
                double saque = ler.nextDouble();
                if (saldo > saque) {
                    saldo -= saque;
                    System.out.println("Novo saldo: " + saldo);
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            } else if(opcao == 2) {
                System.out.println("Valor a depositar:");
                double deposito = ler.nextDouble();
                saldo += deposito;
                System.out.println("Saldo: " + saldo);
            } else if(opcao == 3) {
                System.out.println("Saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }while(opcao != 4);
    }
}
