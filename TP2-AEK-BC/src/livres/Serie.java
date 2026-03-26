package livres;

import java.util.ArrayList;

public class Serie {

    private String nom = "";
    ArrayList<Ouvrage> listeOuvrage = new ArrayList<>();

    public Serie(String nom, ArrayList<Ouvrage> listeOuvrage) {
        this.nom = nom;
        this.listeOuvrage = listeOuvrage;
    }


    public String getNom() {
        return nom;
    }

    public ArrayList<Ouvrage> getListeOuvrage() {
        return listeOuvrage;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setListeOuvrage(ArrayList<Ouvrage> listeOuvrage) {
        this.listeOuvrage = listeOuvrage;
    }

    //Methodes utiles
    public void ajoutOuvrageListe(ArrayList<Ouvrage> listeOuvrage){
        listeOuvrage.add(new Ouvrage("", new Auteur(" ", " ", new Pays(Pays.NOM_PAYS_DEFAUT, Pays.CODE_PAYS_DEFAUT)), Ouvrage.TYPE_DEFAULT));
    }

    public void retirerOuvrageListe(Ouvrage o){
        listeOuvrage.remove(o);
    }

}
