import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o identificador da bomba:");
        String idBomba = sc.nextLine();

        Bomba bomba = new Bomba();
        ArrayList<Combustivel> combustiveis = new ArrayList<Combustivel>();
        bomba.setId(idBomba);

    }
}