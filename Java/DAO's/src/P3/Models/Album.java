package P3.Models;

import java.sql.Date;
import java.util.ArrayList;

public class Album {

    private int albumnummer;
    private String naam;
    private Date uitgeefdatum;
    private ArrayList<Nummer> nummers;

    public Album(int albumnummer, String naam, Date uitgeefdatum) {
        this.albumnummer = albumnummer;
        this.naam = naam;
        this.uitgeefdatum = uitgeefdatum;
    }

    public int getAlbumnummer() {
        return albumnummer;
    }

    public void setAlbumnummer(int albumnummer) {
        this.albumnummer = albumnummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Date getUitgeefdatum() {
        return uitgeefdatum;
    }

    public void setUitgeefdatum(Date uitgeefdatum) {
        this.uitgeefdatum = uitgeefdatum;
    }

    public ArrayList<Nummer> getNummers() {
        return nummers;
    }

    public void setNummers(ArrayList<Nummer> nummers) {
        this.nummers = nummers;
    }
}
