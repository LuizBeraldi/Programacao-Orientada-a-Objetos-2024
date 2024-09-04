class Onibus implements Veiculo, Manutencao {
    private String modelo;
    private String placa;
    private double nivelCombustivel;
    private double consumoCombustivel;
    private int nroPassageiros;
    private double kmPosManutencao;

    public Onibus(String modelo, String placa, double consumoCombustivel, int nroPassageiros){
        this.modelo = modelo;
        this.placa = placa;
        this.nivelCombustivel = 0.0;
        this.consumoCombustivel = consumoCombustivel;
        this.nroPassageiros = nroPassageiros;
        this.kmPosManutencao = 0.0;
    }

    @Override
    public void mover(double distancia){
        double fatorPassageiros = 1 + (nroPassageiros / 50.0);
        double combustivelNecessario = (distancia / consumoCombustivel) * fatorPassageiros;

        if(combustivelNecessario <= nivelCombustivel){
            nivelCombustivel -= combustivelNecessario;
            kmPosManutencao += distancia;
            System.out.println("O ônibus " + modelo + " se locomoveu por " + distancia + " km.");
        }else{
            System.out.println("Combustível insuficiente para mover o ônibus.");
        }
    }

    @Override
    public void abastecer(double quantidade){
        nivelCombustivel += quantidade;
        System.out.println("Ônibus abastecido com " + quantidade + " litros.");
    }

    @Override
    public void realizarManutencao(){
        kmPosManutencao = 0.0;
        System.out.println("Manutenção realizada no ônibus " + modelo + ".");
    }

    @Override
    public String getPlaca(){
        return placa;
    }

    public String toString(){
        return "\tÔnibus \n->Modelo = " + modelo + "\n->Placa = " + placa + "\n->Nivel de Combustivel = " + nivelCombustivel + "\n->Km Pós Manutencao = " + kmPosManutencao;
    }
}
