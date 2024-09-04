public class Estrela {
    private String nome, tipo;
    private int distancia;
    private static int contadorEstrelas;

    public Estrela(String nome, String tipo, int distancia) {
        this.nome = nome;
        this.tipo = tipo;
        this.distancia = distancia;
        contadorEstrelas++;
    }

    public void exibirDetalhes() {
        System.out.println("Nome = " + nome +
                ", Tipo = " + tipo +
                ", Distancia = " + distancia +
                " Anos Luz");
    }

    public static void obterContadorEstrelas(){
        System.out.println("Quantidade de estrelas: " + contadorEstrelas);
    }
}
