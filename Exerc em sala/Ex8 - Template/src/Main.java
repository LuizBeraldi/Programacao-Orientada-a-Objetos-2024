import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MP3 m1 = new MP3("Safe and Sound", "Capital Cities", "Album 1");
        MP3 m2 = new MP3("Meu lugar", "Seu Zé", "Album 2");
        MP3 m3 = new MP3("Poker Face", "Lady Gaga", "Album 3");

        List<MP3> playlist = new ArrayList<MP3>();

        playlist.add(m1);
        playlist.add(m2);
        playlist.add(m3);

        Organizar porArtista = new OrganizarArtista();
        Organizar porNome = new OrganizarNome();
        Organizar porAlbum = new OrganizarAlbum();

        porArtista.ordenar(playlist);
        System.out.println("POR ARTISTA:\n");
        for(MP3 mp3 : playlist){
            mp3.imprimir();
            System.out.println("=======================");
        }
        System.out.println("########################################################################");

        porNome.ordenar(playlist);
        System.out.println("POR TITULO:\n");
        for(MP3 mp3 : playlist){
            mp3.imprimir();
            System.out.println("=======================");
        }
        System.out.println("########################################################################");

        porAlbum.ordenar(playlist);
        System.out.println("POR ALBUM:\n");
        for(MP3 mp3 : playlist){
            mp3.imprimir();
            System.out.println("=======================");
        }
    }
}