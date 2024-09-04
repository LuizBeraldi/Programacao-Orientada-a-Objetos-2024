public class Livros {
    private String titulo, autor;
    private int publicacao, paginas;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPublicacao(int publicacao) {
        this.publicacao = publicacao;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Titulo = '" + titulo + '\'' +
                ", Autor = '" + autor + '\'' +
                ", Ano de Publicação = " + publicacao +
                ", Quantidade de Páginas = " + paginas;
    }
}
