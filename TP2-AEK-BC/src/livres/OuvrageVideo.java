package livres;

import java.util.Objects;

public class OuvrageVideo {
    private int dureeEnMinutes;
    private double taille;

    public OuvrageVideo(int dureeEnMinutes, double taille) {
        this.dureeEnMinutes = dureeEnMinutes;
        this.taille = taille;
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
        OuvrageVideo that = (OuvrageVideo) o;
        return dureeEnMinutes == that.dureeEnMinutes && Double.compare(taille, that.taille) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dureeEnMinutes, taille);
    }

    @Override
    public String toString() {
        return "OuvrageVideo{" +
                "dureeEnMinutes=" + dureeEnMinutes +
                ", taille=" + taille +
                '}';
    }
}
