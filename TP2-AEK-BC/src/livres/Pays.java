package livres;

public class Pays {
    //Constantes
    public static final String NOM_PAYS_DEFAUT = "nom defaut";
    public static final String CODE_PAYS_DEFAUT = "DEF";
    //Attributs
    private String nomPays = NOM_PAYS_DEFAUT;
    private String codePays = CODE_PAYS_DEFAUT;

    public Pays(String nomPays, String codePays) {
        this.nomPays = nomPays;
        this.codePays = codePays;
    }

    //fin classe
}
