package musica;

public class Musica {

    protected String artista;
    protected String nomeMus;
    protected String album;
    protected double duracaoMus;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
            this.album = album;
    }
    
    public String getArtista() {

        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getDuracaoMus() {
        return duracaoMus;
    }

    public void setDuracaoMus(double duracaoMus) {
        this.duracaoMus = duracaoMus;
    }

    public String getNomeMus() {

        return nomeMus;
    }

    public void setNomeMus(String nomeMus) {
        this.nomeMus = nomeMus;
    }
}
