public class Main {
    public static void main(String[] args) {
        Suco s1 = new SucoBasico("Laranja", 10);
        System.out.print(s1.getNome());
        System.out.println(" -> R$"+s1.getPreco());

        Suco s2 = new SucoDecoratorLeite(s1);
        System.out.print(s2.getNome());
        System.out.println(" -> R$"+s2.getPreco());

        Suco s3 = new SucoDecoratorCondensado(s1);
        System.out.print(s3.getNome());
        System.out.println(" -> R$"+s3.getPreco());

        Suco s4 = new SucoDecoratorCondensado(s2);
        System.out.print(s4.getNome());
        System.out.println(" -> R$"+s4.getPreco());
    }
}