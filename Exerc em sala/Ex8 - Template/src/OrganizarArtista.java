public class OrganizarArtista extends Organizar{
    public int ordenar(MP3 m1, MP3 m2){
        return m1.getArtista().compareToIgnoreCase(m2.getArtista());
    }
}
