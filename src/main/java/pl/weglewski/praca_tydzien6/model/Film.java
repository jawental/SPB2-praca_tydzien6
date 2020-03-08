package pl.weglewski.praca_tydzien6.model;

public class Film {

    private Long id;
    private String tytul;
    private int rok;
    private String produkcja;

    public Film(long id, String tytul, int rok, String produkcja) {
        this.id = id;
        this.tytul = tytul;
        this.rok = rok;
        this.produkcja = produkcja;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public String getProdukcja() {
        return produkcja;
    }

    public void setProdukcja(String produkcja) {
        this.produkcja = produkcja;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", tytul='" + tytul + '\'' +
                ", rok=" + rok +
                ", producent='" + produkcja + '\'' +
                '}';
    }
}
