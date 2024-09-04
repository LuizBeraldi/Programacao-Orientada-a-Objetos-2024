import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float imc, altura, peso;

        System.out.println("Digite sua altura (Ex: 1,75): ");
        altura = sc.nextFloat();

        System.out.println("Digite o seu peso: ");
        peso = sc.nextInt();

        imc = peso / (altura * altura);

        System.out.printf("Seu IMC é %.2f",imc);
    }
}