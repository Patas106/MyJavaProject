public class Pozemek {
    private int vymera;
    private String popis;
    private int cenaZaMetr;

    public Pozemek(int vymera, String popis, int cenaZaMetr) {
        this.vymera = vymera;
        this.popis = popis;
        this.cenaZaMetr = cenaZaMetr;
    }

    public int getVymera() {
        return vymera;
    }

    public void setVymera(int vymera) {
        this.vymera = vymera;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public int getCenaZaMetr() {
        return cenaZaMetr;
    }

    public void setCenaZaMetr(int cenaZaMetr) {
        this.cenaZaMetr = cenaZaMetr;
    }
}
