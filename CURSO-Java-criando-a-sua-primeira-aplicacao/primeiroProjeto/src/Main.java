public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: "+anoDeLancamento);

        boolean incluidoNoPlano = true;

        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse;
        //essa forma de escrever strings ja formatando so foi inclusa no java 15
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento:
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);

        double temperatura = 30.4;
        double temperaturaFarenheit = (temperatura * 1.8) + 32;
        String mensagem = String.format("A temperatura %f Celsius convertida para Farenheit é %f Farenheit", temperatura, temperaturaFarenheit);
        System.out.println(mensagem);

        int temperaturaFarenheitInteira = (int) temperaturaFarenheit;
    }
}