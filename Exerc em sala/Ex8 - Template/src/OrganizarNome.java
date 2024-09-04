public class OrganizarNome extends Organizar{
    public int ordenar(MP3 m1, MP3 m2){
        return m1.getNome().compareToIgnoreCase(m2.getNome());
    }
}
