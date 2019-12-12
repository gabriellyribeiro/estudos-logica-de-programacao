package musica;

public class Teste {

    public static void main(String[] args) {
        Musica wantYouBad = new Musica(); // The Offspring
        Musica defyYou = new Musica(); // The Offspring

        wantYouBad.setArtista("The Offspring");
        wantYouBad.setNomeMus("Want You Bad");
        wantYouBad.setAlbum("Americana");
        wantYouBad.setDuracaoMus(3.0);

        defyYou.setArtista("The Offspring");
        defyYou.setNomeMus("Defy You");
        defyYou.setAlbum("Ixnay on the hombre");
        defyYou.setDuracaoMus(3.4);
        System.out.println(defyYou.getArtista() + " - " + defyYou.getNomeMus() + " / " + defyYou.getAlbum()
                + " | Duração: " + defyYou.getDuracaoMus());
        System.out.println(wantYouBad.getArtista() + " - " + wantYouBad.getNomeMus() + " / " + wantYouBad.getAlbum()
                + " | Duração: " + wantYouBad.getDuracaoMus());

        System.out.println();
        System.out.println("Aqui está, elementos da classe Filha CDDeMusicas: ");
        CDDeMusicas dataB = new CDDeMusicas(" ", " ", " ", 0.13);

    }
}
