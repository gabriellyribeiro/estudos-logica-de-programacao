package musica;

public class CDDeMusicas extends Musica {
    public CDDeMusicas(String artista, String nomeMus, String album, double duracaoMus) {
        artista = "Aerosmith";
        nomeMus = "Full Circle";
        album = "Nine Lives";
        duracaoMus = 5.1;

        System.out.println(artista + " - " + nomeMus + " / " + album + " | " + duracaoMus);
    }

    public CDDeMusicas() {

    }

}
