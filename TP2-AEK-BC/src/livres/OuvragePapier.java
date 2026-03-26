package livres;

import java.time.LocalDate;

public class OuvragePapier extends Ouvrage {
    private int nombreDePages;

    public OuvragePapier(String titre, Auteur auteur, LocalDate date, int nombreExemplaires, int nombreDePages) {
        super(titre, auteur, date, nombreExemplaires);
    }

    public void setNombreDePages(int nombreDePages) {
        this.nombreDePages = nombreDePages;
    }

    public int getNombreDePages() {
        return nombreDePages;
    }

    @Override
    public String toString() {
        return "OuvragePapier{" +
                "nombreDePages=" + nombreDePages +
                ", titre='" + titre + '\'' +
                ", auteur=" + auteur +
                ", date=" + date +
                ", nombreExemplaires=" + nombreExemplaires +
                '}';
    }
}
