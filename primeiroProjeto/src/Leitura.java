import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu filme favorito");
        String filme = ler.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = ler.nextInt();
    }
}
