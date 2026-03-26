package tests;

import livres.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Librairie {
    private List<Auteur> auteurs  = new ArrayList<>();
    private List<Ouvrage> ouvrages = new ArrayList<>();

    public Librairie(){
        Auteur albertine = new Auteur("Albertine", "Tremblay", new Pays("Canada", "CAD"));
        Auteur john = new Auteur("John", "Smith", new Pays("Etats-Unis", "USA"));
        Auteur jean = new Auteur("Jean", "Némarre", new Pays("Suisse", "SUI"));
        auteurs.add(albertine);
        auteurs.add(john);
        auteurs.add(jean);

        ouvrages.add(new OuvragePapier("Titre 1",albertine, LocalDate.now(), 1, 23 ));
        ouvrages.add(new OuvrageVideo("Titre 2", albertine, LocalDate.now(), 78, 90, 1.3));
        ouvrages.add(new OuvrageVideo("Titre 3", john, LocalDate.now(), 43, 6, 1.73));
        ouvrages.add(new OuvrageVideo("Titre 4", john,  LocalDate.now(), 2, 3, 20.4));
        ouvrages.add(new OuvrageAudio("Titre 5", albertine, LocalDate.now(), 100, 3, FormatAudio.NUMERIQUE));
        ouvrages.add(new OuvragePapier("Titre 6", john, LocalDate.now(), 2, 1));
        ouvrages.add(new OuvragePapier("Titre 7", john, LocalDate.now(), 2, 400));
        ouvrages.add(new OuvrageVideo("Titre 8", john,  LocalDate.now(), 2, 3, 20.4));
        ouvrages.add(new OuvrageVideo("Titre 9", john,  LocalDate.now(), 2, 3, 20.4));
        ouvrages.add(new OuvrageAudio("Titre 5", albertine, LocalDate.now(), 100, 3, FormatAudio.ANALOGIQUE));
    }

    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    public List<Ouvrage> getOuvrages() {
        return ouvrages;
    }

    public List<Ouvrage> trouverOuvrages(Auteur auteur) {
        //ATTENTION il faut implémenter equals dans auteur pour que ca marche!!!!!
        int count = 0;

        List<Ouvrage> trouves = new ArrayList<>();
        for (Ouvrage ouvrage : ouvrages) {
            if (ouvrage.getAuteur().equals(auteur)) {
                trouves.add(ouvrage);
            }
        }

        return trouves;
    }
}
