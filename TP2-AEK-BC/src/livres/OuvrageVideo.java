package livres;

import java.time.LocalDate;
import java.util.Objects;

public class OuvrageVideo extends Ouvrage{
    private int dureeEnMinutes;
    private double taille;

    public OuvrageVideo(String titre, Auteur auteur, LocalDate date, int nombreExemplaires) {
        super(titre, auteur, date, nombreExemplaires);
    }

    public OuvrageVideo(String titre, Auteur auteur) {
        super(titre, auteur);
    }

    public int getDureeEnMinutes() {
        return dureeEnMinutes;
    }

    public void setDureeEnMinutes(int dureeEnMinutes) {
        this.dureeEnMinutes = dureeEnMinutes;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OuvrageVideo that = (OuvrageVideo) o;
        return dureeEnMinutes == that.dureeEnMinutes && Double.compare(taille, that.taille) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dureeEnMinutes, taille);
    }

    @Override
    public String toString() {
        return "OuvrageVideo{" +
                "dureeEnMinutes=" + dureeEnMinutes +
                ", taille=" + taille +
                "} " + super.toString();
    }
}
