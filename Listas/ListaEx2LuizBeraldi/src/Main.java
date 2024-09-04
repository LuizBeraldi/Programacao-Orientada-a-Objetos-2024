import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> senha = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int opc;

        do{
            opc = Menu();
            switch (opc){
                case 1:
                    emitirSenha(senha);
                    break;
                case 2:
                    System.out.println("Digite a senha que deseja desistir:");
                    int desistente = sc.nextInt();
                    desistirFila(senha,desistente);
                    break;
                case 3:
                    atenderUsuario(senha);
                    break;
                case 4:
                    System.out.println("Digite a senha que deseja buscar:");
                    int posicao = sc.nextInt();
                    buscarPosicao(senha,posicao);
                    break;
                case 5:
                    imprimirFila(senha);
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha uma opção válida:");
                    break;
            }
        }while(opc != 6);
    }

    public static int Menu(){
        int opc;

        System.out.println("\n1 - Emitir Senha");
        System.out.println("2 - Desistir");
        System.out.println("3 - Atender Usuario");
        System.out.println("4 - Buscar Senha");
        System.out.println("5 - Imprimir Fila");
        System.out.println("6 - Encerrar Programa");
        System.out.print("Opcão: ");

        Scanner sc = new Scanner(System.in);
        opc = sc.nextInt();
        return opc;
    }

    public static void emitirSenha(ArrayList<Integer> senha){
        SecureRandom rd = new SecureRandom();
        int num = rd.nextInt(100);
        senha.add(senha.size(),num);
        System.out.println("A senha emitida é:"+num);
    }

    public static void desistirFila(ArrayList<Integer> senha, int desistente){
        if(senha.contains(desistente)){
            senha.remove((Integer)desistente);
            System.out.println("A senha removida é: "+desistente);
        }else{
            System.out.println("A senha não existe!");
        }
    }

    public static void atenderUsuario(ArrayList<Integer> senha){
        if(!senha.isEmpty()){
            int atendida = senha.get(0);
            System.out.println("A senha atendida é: "+atendida);
            senha.remove((Integer)atendida);
        }else{
            System.out.println("A fila está vazia!");
        }
    }

    public static void buscarPosicao(ArrayList<Integer> senha, int posicao){
        if(senha.contains(posicao)){
            System.out.println("A senha está na posição: "+(senha.indexOf(posicao)+1));
        }else{
            System.out.println("Essa senha não existe!");
        }
    }

    public static void imprimirFila(ArrayList<Integer> senha){
        System.out.println("Fila: ");
        for(int num : senha){
            System.out.print(num+" - ");
        }
        System.out.println();
    }
}