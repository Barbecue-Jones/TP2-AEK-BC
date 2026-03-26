package livres;

import java.text.Format;
import java.util.Objects;

public class OuvrageAudio {
    public final FormatAudio FORMAT_DEFAUT = FormatAudio.ANALOGIQUE;

    private int nbMinutes;
    private FormatAudio format = FORMAT_DEFAUT;

    public OuvrageAudio(int nbMinutes, FormatAudio format) {
        this.nbMinutes = nbMinutes;
        this.format = format;
    }

    //getters/setters
    public int getNbMinutes() {
        return nbMinutes;
    }

    public void setNbMinutes(int nbMinutes) {
        this.nbMinutes = nbMinutes;
    }

    public FormatAudio getFormat() {
        return format;
    }

    public void setFormat(FormatAudio format) {
        this.format = format;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OuvrageAudio that = (OuvrageAudio) o;
        return nbMinutes == that.nbMinutes && FORMAT_DEFAUT == that.FORMAT_DEFAUT && format == that.format;
    }

    @Override
    public int hashCode() {
        return Objects.hash(FORMAT_DEFAUT, nbMinutes, format);
    }

    @Override
    public String toString() {
        return "OuvrageAudio{" +
                "FORMAT_DEFAUT=" + FORMAT_DEFAUT +
                ", nbMinutes=" + nbMinutes +
                ", format=" + format +
                '}';
    }
}
