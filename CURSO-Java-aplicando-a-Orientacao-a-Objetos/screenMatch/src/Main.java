public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "O poderoso chefão";
        filme.anoDeLancamento = 1970;
        filme.duracaoEmMinutos = 180;
        filme.incluidoNoPlano = true;

        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(10);
        filme.avalia(9);
        
        System.out.println(filme.somaDasAvaliacoes);
        System.out.println(filme.totalDeAvaliacoes);
        System.out.println(filme.obterMediaDasAvaliacoes());
    }
}