import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> frota = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("\n\tEscolha uma opção:");
            System.out.println("\t1 - Cadastrar veículo na frota");
            System.out.println("\t2 - Mover veículo");
            System.out.println("\t3 - Abastecer veículo");
            System.out.println("\t4 - Realizar manutenção em um ônibus");
            System.out.println("\t5 - Exibir informações do veículo");
            System.out.println("\t6 - Sair");
            System.out.print("->");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    cadastrarVeiculo(frota, scanner);
                    break;
                case 2:
                    moverVeiculo(frota, scanner);
                    break;
                case 3:
                    abastecerVeiculo(frota, scanner);
                    break;
                case 4:
                    realizarManutencaoOnibus(frota, scanner);
                    break;
                case 5:
                    exibirInformacoes(frota, scanner);
                    break;
                case 6:
                    System.out.println("Finalizando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!\nDigite novamente!");
            }
        }while (opcao != 6);
        scanner.close();
    }

    public static void cadastrarVeiculo(ArrayList<Veiculo> frota, Scanner scanner){
        System.out.println("\n\tEscolha o tipo de veículo:");
        System.out.println("\t1. Carro");
        System.out.println("\t2. Caminhão");
        System.out.println("\t3. Ônibus");
        System.out.print("->");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\nModelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Placa: ");
        String placa = scanner.nextLine();

        for(Veiculo veiculo : frota){
            if(veiculo.getPlaca().equalsIgnoreCase(placa)){
                System.out.println("O veículo com a placa " + placa + " já está cadastrado.");
                return;
            }
        }

        System.out.print("Consumo de combustível (km por litro): ");
        double consumoCombustivel = scanner.nextDouble();

        switch (tipo){
            case 1:
                frota.add(new Carro(modelo, placa, consumoCombustivel));
                System.out.println("Carro cadastrado.");
                break;
            case 2:
                System.out.print("Carga (em kg): ");
                double carga = scanner.nextDouble();
                frota.add(new Caminhao(modelo, placa, consumoCombustivel, carga));
                System.out.println("Caminhão cadastrado.");
                break;
            case 3:
                System.out.print("Número de passageiros: ");
                int nroPassageiros = scanner.nextInt();
                frota.add(new Onibus(modelo, placa, consumoCombustivel, nroPassageiros));
                System.out.println("Ônibus cadastrado.");
                break;
            default:
                System.out.println("O tipo de veículo é inválido.");
        }
    }

    public static void moverVeiculo(ArrayList<Veiculo> frota, Scanner scanner){
        System.out.print("\nDigite a placa do veículo a ser movido: ");
        String placa = scanner.next();
        Veiculo veiculo = buscarVeiculoPorPlaca(frota, placa);

        if(veiculo != null){
            System.out.print("Digite a distância a ser percorrida: ");
            double distancia = scanner.nextDouble();
            veiculo.mover(distancia);
        }else{
            System.out.println("O veículo não foi encontrado.");
        }
    }

    public static void abastecerVeiculo(ArrayList<Veiculo> frota, Scanner scanner){
        System.out.print("\nDigite a placa do veículo a ser abastecido: ");
        String placa = scanner.next();
        Veiculo veiculo = buscarVeiculoPorPlaca(frota, placa);

        if(veiculo != null){
            System.out.print("Digite a quantidade de combustível a ser abastecida: ");
            double quantidade = scanner.nextDouble();
            veiculo.abastecer(quantidade);
        }else{
            System.out.println("O veículo não foi encontrado.");
        }
    }

    public static void realizarManutencaoOnibus(ArrayList<Veiculo> frota, Scanner scanner){
        System.out.print("\nDigite a placa do ônibus: ");
        String placa = scanner.next();
        Veiculo veiculo = buscarVeiculoPorPlaca(frota, placa);

        if(veiculo instanceof Onibus){
            Onibus onibus = (Onibus) veiculo;
            onibus.realizarManutencao();
        }else{
            System.out.println("O veículo não é um ônibus ou não foi encontrado.");
        }
    }

    public static void exibirInformacoes(ArrayList<Veiculo> frota, Scanner scanner){
        System.out.print("\nDigite a placa do veículo: ");
        String placa = scanner.next();
        Veiculo veiculo = buscarVeiculoPorPlaca(frota, placa);

        if(veiculo != null){
            System.out.println(veiculo);
        }else{
            System.out.println("O veículo não encontrado.");
        }
    }

    public static Veiculo buscarVeiculoPorPlaca(ArrayList<Veiculo> frota, String placa){
        for(Veiculo veiculo : frota){
            if(veiculo.getPlaca().equalsIgnoreCase(placa)){
                return veiculo;
            }
        }
        return null;
    }
}