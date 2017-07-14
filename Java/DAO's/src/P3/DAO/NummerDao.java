package P3.DAO;

import P3.Models.Album;
import P3.Models.Nummer;

import java.sql.Connection;
import java.util.ArrayList;

public interface NummerDao{

    ArrayList<Nummer> getAll();

    Nummer getNummerById(int id);

    ArrayList<Album> getAlbumsByNummerId(int id);

    void addNummer(Nummer n, Album a);

    void updateNummer(Nummer n, Album a, int id);

    void deleteNummer(Nummer n);

    void addAlbumsToNummer(ArrayList<Album> albums, int nummer);

}
