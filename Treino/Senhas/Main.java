import java.util.Scanner;
import java.security.SecureRandom;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> senha = new ArrayList<Integer>();
        int opc;

        do{
            opc = Menu();
            switch(opc){
                case 1:
                    emitirSenha(senha);
                    break;
                case 2:
                    System.out.println("Digite a senha que vai desistir:");
                    int num = sc.nextInt();
                    desistirFila(senha,num);
                    break;
                case 3:
                    atenderUsuario(senha);
                    break;
                case 4:
                    System.out.println("Digite a senha à ser buscada:");
                    int buscar = sc.nextInt();
                    buscarSenha(senha,buscar);
                    break;
                case 5:
                    imprimirFila(senha);
                    break;
                case 6:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha novamente!");
                    break;
            }
        }while(opc != 6);
    }

    public static int Menu(){
        int opc; 

        System.out.println("\n1 - Emitir Senha");
        System.out.println("2 - Desistir");
        System.out.println("3 - Atender Usuário");
        System.out.println("4 - Buscar Senha");
        System.out.println("5 - Imprimir Fila");
        System.out.println("6 - Encerrar Sistema");
        System.out.print("Escolha uma opção: ");

        Scanner sc = new Scanner(System.in);
        opc = sc.nextInt();
        return opc;
    }

    public static void emitirSenha(ArrayList<Integer> senha){
        SecureRandom rd = new SecureRandom();
        int num = rd.nextInt(100);
        senha.add(senha.size(),num);
        System.out.println("A senha gerada é: "+num);
    }

    public static void desistirFila(ArrayList<Integer> senha, int num){
        if(senha.contains(num)){
            senha.remove((Integer)num);
            System.out.println("A senha "+num+" foi removida com sucesso!");
        }else{
            System.out.println("A senha escolhida não existe!");
        }
    }

    public static void atenderUsuario(ArrayList<Integer> senha){
        if(!senha.isEmpty()){
            int atendida = senha.get(0);
            senha.remove((Integer)atendida);
            System.out.println("A senha atendida é: "+atendida);
        }else{
            System.out.println("A fila está vazia!");
        }
    }

    public static void buscarSenha(ArrayList<Integer> senha, int buscar){
        if(senha.contains(buscar)){
            System.out.println("A senha está na posição " +(senha.indexOf(buscar)+1));
        }else{
            System.out.println("A senha não existe!");
        }
    }

    public static void imprimirFila(ArrayList<Integer> senha){
        if(!senha.isEmpty()){
            System.out.println("Fila: ");
            for(int num : senha){
                System.out.print(num +" - ");
            }
            System.out.println();
        }else{
            System.out.println("A fila está vazia!");
        }
    }
}