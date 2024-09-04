import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x;
        System.out.println("Digite o número de triângulos:");
        x = sc.nextInt();
        System.out.println("Digite o número de niveis:");
        n = sc.nextInt();
        for(int y=0;y<x;y++){
            for(int i=0;i<=n;i++){
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}