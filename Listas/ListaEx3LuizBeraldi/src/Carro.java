class Carro implements Veiculo {
    private String modelo;
    private String placa;
    private double nivelCombustivel;
    private double consumoCombustivel;

    public Carro(String modelo, String placa, double consumoCombustivel){
        this.modelo = modelo;
        this.placa = placa;
        this.nivelCombustivel = 0.0;
        this.consumoCombustivel = consumoCombustivel;
    }

    @Override
    public void mover(double distancia){
        double combustivelNecessario = distancia / consumoCombustivel;

        if(combustivelNecessario <= nivelCombustivel){
            nivelCombustivel -= combustivelNecessario;
            System.out.println("O carro " + modelo + " se locomoveu por " + distancia + " km.");
        }else{
            System.out.println("Combustível insuficiente para mover o carro.");
        }
    }

    @Override
    public void abastecer(double quantidade){
        nivelCombustivel += quantidade;
        System.out.println("Carro abastecido com " + quantidade + " litros de combustível.");
    }

    @Override
    public String getPlaca(){
        return placa;
    }

    public String toString(){
        return "\tCarro \n->Modelo = " + modelo + "\n->Placa = " + placa + "\n->Nivel de Combustível = " + nivelCombustivel;
    }
}