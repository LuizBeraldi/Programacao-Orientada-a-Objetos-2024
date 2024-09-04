class Caminhao implements Veiculo {
    private String modelo;
    private String placa;
    private double nivelCombustivel;
    private double consumoCombustivel;
    private double carga;

    public Caminhao(String modelo, String placa, double consumoCombustivel, double carga){
        this.modelo = modelo;
        this.placa = placa;
        this.nivelCombustivel = 0.0;
        this.consumoCombustivel = consumoCombustivel;
        this.carga = carga;
    }

    @Override
    public void mover(double distancia){
        double fatorCarga = 1 + (carga / 1000);
        double combustivelNecessario = (distancia / consumoCombustivel) * fatorCarga;

        if(combustivelNecessario <= nivelCombustivel){
            nivelCombustivel -= combustivelNecessario;
            System.out.println("O caminhão " + modelo + " se locomoveu por " + distancia + " km.");
        }else{
            System.out.println("Combustível insuficiente para mover o caminhão.");
        }
    }

    @Override
    public void abastecer(double quantidade){
        nivelCombustivel += quantidade;
        System.out.println("Caminhão abastecido com " + quantidade + " litros.");
    }

    @Override
    public String getPlaca(){
        return placa;
    }

    public String toString(){
        return "\tCaminhão \n->Modelo = " + modelo + "\n->Placa = " + placa +
                "\n->Nivel de Combustivel = " + nivelCombustivel + "\n->Carga (em Kg) = " + carga;
    }
}