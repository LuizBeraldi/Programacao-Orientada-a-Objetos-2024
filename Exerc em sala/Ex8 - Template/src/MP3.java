public class MP3 {
    private String nome;
    private String artista;
    private String album;

    public MP3(String nome, String artista, String album){
        this.nome = nome;
        this.artista = artista;
        this.album = album;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void imprimir(){
        System.out.println("Nome da música:"+this.getNome());
        System.out.println("Nome do album:"+this.getAlbum());
        System.out.println("Nome do artista:"+this.getArtista());
    }
}
