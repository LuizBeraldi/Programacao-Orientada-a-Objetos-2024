public class Combustivel {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double abastecerLitros(double litros){
        double valor = litros * this.preco;
        return valor;
    }

    public double abastecerValor(double valor){
        double litros = valor * this.preco;
        return litros;
    }
}
