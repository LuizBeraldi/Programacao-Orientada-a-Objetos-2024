public class Main {
    public static void main(String[] args) {
        Livros l1 = new Livros();
        Livros l2 = new Livros();

        l1.setAutor("Olavo de Carvalho");
        l1.setTitulo("POO");
        l1.setPublicacao(2024);
        l1.setPaginas(200);

        l2.setAutor("José de Alencar");
        l2.setTitulo("Algoritmos");
        l2.setPublicacao(2023);
        l2.setPaginas(150);

        System.out.println(l1.toString());
        System.out.println(l2.toString());
    }
}