import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1, b = 1, c = 0;

        System.out.print("Digite a posição na sequência de Fibonacci (n): ");
        int n = sc.nextInt();

        if(n < 0){
            System.out.println("Valor inválido!");
        }else{
            if(n == 1 || n == 2){
                System.out.println(a);
            }else{
                int aux;
                for(int i = 0; i < n -2; i++){
                    c = a + b;
                    aux = b;
                    b = c;
                    a = aux;
                }
                System.out.println("O valor da n-ésima posição na sequência de Fibonacci: " + c);
            }
        }
    }
}