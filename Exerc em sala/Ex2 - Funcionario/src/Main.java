public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        f1.nome = "Luiz";
        f1.salario = 1000;

        f2.nome = "Henrique";
        f2.salario = 1200;

        System.out.println(f1.nome+" "+f1.salario+" "+Funcionario.getVale());
        System.out.println(f2.nome+" "+f2.salario+" "+Funcionario.getVale());

        Funcionario.ajustarValor(1.1);

        System.out.println(f1.nome+" "+f1.salario+" "+Funcionario.getVale());
        System.out.println(f2.nome+" "+f2.salario+" "+Funcionario.getVale());
    }
}