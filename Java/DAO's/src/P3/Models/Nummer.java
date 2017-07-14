package P3.Models;

import java.util.ArrayList;

public class Nummer {

    private int id;
    private String titel;
    private ArrayList<Album> albums;

    public Nummer(int id, String titel) {
        this.id = id;
        this.titel = titel;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAlbums(ArrayList<Album> albums){

        this.albums = albums;

    }

    public ArrayList<Album> getAlbums() {
        return this.albums;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Nummer nummer = (Nummer) o;

        if (id != nummer.id) return false;
        return titel != null ? titel.equals(nummer.titel) : nummer.titel == null;
    }

}
