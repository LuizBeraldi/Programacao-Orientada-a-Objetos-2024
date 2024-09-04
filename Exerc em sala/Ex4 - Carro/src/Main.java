public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.setModelo("Camaro");
        c1.setMarca("Chevrolet");
        c1.setVelocidade(20);

        c2.setModelo("Uno");
        c2.setMarca("Fiat");
        c2.setVelocidade(30);

        c1.calcularMarcha(c1.getVelocidade());
        c2.calcularMarcha(c2.getVelocidade());
    }
}