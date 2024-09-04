public class Main {
    public static void main(String[] args) {
        String nome = args[0];
        int n = Integer.parseInt(args[1]);

        for(int i = 0; i < n; i++){
            System.out.println(nome);
        }
    }
}