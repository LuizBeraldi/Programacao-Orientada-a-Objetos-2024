public class Carro {
    private String marca, modelo;
    private int velocidade;

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void calcularMarcha(int getVelocidade){
        if(velocidade < 10){
            System.out.println(toString());
            System.out.println("1° marcha");
        } else if (velocidade >= 10 && velocidade < 20) {
            System.out.println(toString());
            System.out.println("2° marcha");
        } else if (velocidade >= 20 && velocidade < 30) {
            System.out.println(toString());
            System.out.println("3° marcha");
        } else if (velocidade >= 30 && velocidade < 40) {
            System.out.println(toString());
            System.out.println("4° marcha");
        }
    }

    @Override
    public String toString() {
        return "Marca = '" + marca + '\'' +
                ", Modelo = '" + modelo + '\'' +
                ", Velocidade = " + velocidade;
    }
}
