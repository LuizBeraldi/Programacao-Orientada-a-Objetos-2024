import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int faixas[] = new int[6];
        SecureRandom rd = new SecureRandom();

        for (int i = 0; i < 50; i++) {
            int venda = 1 + rd.nextInt(700);
            if (venda >= 0 && venda <= 99) {
                faixas[0]++;
            } else if (venda >= 100 && venda <= 199) {
                faixas[1]++;
            } else if (venda >= 200 && venda <= 299) {
                faixas[2]++;
            } else if (venda >= 300 && venda <= 399) {
                faixas[3]++;
            } else if (venda >= 400 && venda <= 499) {
                faixas[4]++;
            } else if (venda >= 500) {
                faixas[5]++;
            }
        }

        System.out.println("Contabilização das vendas por faixa de valor:");
        System.out.println("R$0 – R$99: " + faixas[0]);
        System.out.println("R$100 – R$199: " + faixas[1]);
        System.out.println("R$200 – R$299: " + faixas[2]);
        System.out.println("R$300 – R$399: " + faixas[3]);
        System.out.println("R$400 – R$499: " + faixas[4]);
        System.out.println("R$500 – +: " + faixas[5]);

        //Somando dois valores em um array
        int total = 0;
        int valores[] = new int[2];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<2;i++){
            valores[i] = sc.nextInt();
        }
        for(int soma : valores){
            total += soma;
        }
        System.out.println(total);
    }
}