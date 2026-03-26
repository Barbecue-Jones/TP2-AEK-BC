package tests;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import livres.Ouvrage;
import livres.Auteur;
import livres.Pays;
import livres.Serie;

/**
 * CoursPOO 1
 *
 * @author Julien.Brunet màj Jocelyn
 * @since H25
 */
public class TestOuvrage {

    public static void main(String[] args) {
        TestOuvrage test = new TestOuvrage();
        test.testOuvrages();
        test.testTrouver();
    }


    public void testOuvrages() {
        //Ajout de Pays
        Pays canada = new Pays("Canada", "CAD");
        Pays cameroun =  new Pays("Cameroun", "CAM");
        Pays empireRomain = new Pays("Empire Romain", "ER");
        Pays royaumeUni = new Pays("Royaume-Uni", "UK");
        Pays etasUnis = new Pays("Etas-Unis", "USA");

        //Deux auteurs deja prets pour les tests...
        Auteur albertine = new Auteur("Albertine", "Tremblay", canada);
        Auteur john = new Auteur("John", "Smith", etasUnis);
        Auteur Paul = new Auteur("Paul","de Tarse", empireRomain);
        Auteur tolkien = new Auteur("J.R.R", "Tolkien", royaumeUni);

        Serie seigneurDesAnneaux = new Serie("communauteAnneaux", new ArrayList<Ouvrage>());
        Serie bible = new Serie("vieuxTestatment", new ArrayList<Ouvrage>());

        //creation ouvrage
        Ouvrage ouvrage1 = new Ouvrage("ouvrage1", john, Ouvrage.TYPE_DEFAULT);
        Ouvrage ouvrage2 = new Ouvrage("ouvrage2", albertine, Ouvrage.TYPE_DEFAULT);


        //ajout d' ouvrages aux series
        seigneurDesAnneaux.ajoutOuvrageListe(ouvrage1);
        seigneurDesAnneaux.ajoutOuvrageListe(ouvrage2);



        //afficher Serie
        System.out.println("-------ajoutOuvrage------");
        System.out.println(seigneurDesAnneaux);
        System.out.println();

        //retirer ouvrage
        seigneurDesAnneaux.retirerOuvrageListe(ouvrage2);

        //afficher Serie
        System.out.println("-------apresRetraitOuvrage------");
        System.out.println(seigneurDesAnneaux);
        System.out.println();

        //Voici une partie des tests! Il faut en ajouter, pour les fonctionnalités non testées!
        System.out.println("-----Test des constructeurs d'ouvrage et des diverses validations-----------");
        Ouvrage livreA = new Ouvrage("Titre assez long", john);
        System.out.println(livreA);
        Ouvrage livreB = new Ouvrage("Ti", john);
        System.out.println(livreB);
        Ouvrage livreC = new Ouvrage(null, john);
        System.out.println(livreC);

        //bibliotheque.Auteur null et valeur par défaut de l'bibliotheque.Auteur
        Ouvrage livreA1 = new Ouvrage("Titre assez long", null);
        System.out.println(livreA1);
        //bibliotheque.Auteur fonctionnel
        Ouvrage livre1 = new Ouvrage("Tout va bien", albertine);
        System.out.println(livre1);

        //Date null et valeur par défaut de la date
        livre1.setDate(null);
        System.out.println(livre1);
        livre1.setDate(LocalDate.now().minusYears(5));
        System.out.println(livre1);

        //Test de la validation sur le nb d'exemplaires (valide et non valide)
        Ouvrage livre2 = new Ouvrage("Tout va bien", albertine, Ouvrage.Format.AUDIO, LocalDate.now(), -10);
        System.out.println(livre2);

        livre2 = new Ouvrage("Tout va bien", albertine, Ouvrage.Format.PAPIER, LocalDate.now(), 20);
        System.out.println(livre2);

        System.out.println("\n-----Tests des méthodes acheter et vendre-----------");

        Ouvrage livre3 = new Ouvrage("Musique du hasard", new Auteur("Paul", "Auster", null), Ouvrage.Format.PAPIER, LocalDate.now(), 5);
        System.out.println(livre3);

        livre3.acheter(5);
        System.out.println(livre3);

        System.out.println("On peut vendre 8 livres? " + livre3.vendre(8));
        System.out.println(livre3);

        System.out.println("On peut vendre 10 livres? " + livre3.vendre(10));
        System.out.println(livre3);

        Ouvrage livre4 = new Ouvrage("Test", new Auteur("A", "B", null), Ouvrage.Format.PAPIER, LocalDate.now(), 5);

        System.out.println("\n-----Tests de la  méthode equals()-----------");
        //Deux ouvrages égaux
        Ouvrage livre5 = new Ouvrage("Test", new Auteur("A", "B", null), Ouvrage.Format.PAPIER, null, 5);
        Ouvrage livre6 = new Ouvrage("Test", new Auteur("A", "B", null), Ouvrage.Format.PAPIER, LocalDate.now(), 10);
        //Un qui ne l'est pas
        Ouvrage livre7 = new Ouvrage("Test", new Auteur("Z", "B", null), Ouvrage.Format.PAPIER, LocalDate.now(), 5);

        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + livre4.equals(livre5));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + livre4.equals(livre6));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals(livre7));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals(john));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals(null));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals("Test"));
    }


    private void testTrouver() {
        Librairie bibliotheque = new Librairie();
        Auteur john = bibliotheque.getAuteurs().get(1);

        System.out.println("\n-----Test de votre méthode trouverOuvrage-----------");
        List<Ouvrage> resultat = bibliotheque.trouverOuvrages(new Auteur("Albertine", "Tremblay", null));
        System.out.println("Livres de albertine: " + resultat);

        resultat = bibliotheque.trouverOuvrages(john);
        System.out.println("Livres de john: " + resultat);

        resultat = bibliotheque.trouverOuvrages(new Auteur("Jacques", "Beaulieu", null));
        System.out.println("Livres de Jacques: " + resultat);
    }
    //Test
    public void testAfficherAuteurPays() {
        System.out.println("\n-----Tests de la  méthode testAfficherAuteurPays-----------");

        Pays etasUnis = new Pays("Etas-Unis", "USA");

        Auteur ronHubbard = new Auteur("Ron", "Hubbard", etasUnis) ;
    }


}

