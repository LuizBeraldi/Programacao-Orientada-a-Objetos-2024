public class Main {
    public static void main(String[] args) {
        Porta porta = new Porta(false);

        Observer m1 = new Morador("Luiz");
        Observer c2 = new Cachorro("Snoopy");

        porta.addInteressado(m1);
        porta.addInteressado(c2);

        porta.setAberta(true);
        porta.removeInteressado(c2);
        porta.setAberta(false);
    }
} //Por algum motivo o código não funciona sendo que é igual ao observer que tem na pasta
  // de exercicios em sala :) o tal do código espirita