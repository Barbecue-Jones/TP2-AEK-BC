package livres;

import java.util.ArrayList;

public class Serie {
    public static final String NOM_DEFAUT = "Serie Inconnue";

    private String nom = NOM_DEFAUT;
    ArrayList<Ouvrage> listeOuvrage = new ArrayList<>();

    public Serie(String nom, ArrayList<Ouvrage> listeOuvrage) {
        this.nom = nom;
        this.listeOuvrage = listeOuvrage;
    }
//todo Rendre l'affaire utilisable (getters, setters etc)
}
