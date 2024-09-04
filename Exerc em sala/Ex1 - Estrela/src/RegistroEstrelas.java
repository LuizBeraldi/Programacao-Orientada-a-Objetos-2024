import java.lang.Math;

public class RegistroEstrelas {
    public static void main(String[] args) {
        Estrela e1 = new Estrela("Sol", "Anã Amarela", 10);
        Estrela e2 = new Estrela("Cunis Majoris", "Gigante Vermelha", 100);

        e1.exibirDetalhes();
        e2.exibirDetalhes();

        Estrela.obterContadorEstrelas();
    }
}