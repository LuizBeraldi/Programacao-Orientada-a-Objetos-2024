public class OrganizarAlbum extends Organizar{
    public int ordenar(MP3 m1, MP3 m2){
        return m1.getAlbum().compareToIgnoreCase(m2.getAlbum());
    }
}
