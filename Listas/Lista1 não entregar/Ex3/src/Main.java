import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        String nome;

        System.out.println("Digite o seu nome: ");
        nome = sc.next();

        System.out.println("Digite o número de vezes que seu nome irá se repetir: ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.printf("%n%s%n",nome);
        }
    }
}