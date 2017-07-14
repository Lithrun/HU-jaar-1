package P3.DAO;

import P3.Models.Album;
import P3.Models.Nummer;

import java.sql.Connection;
import java.util.ArrayList;


public interface AlbumDao {

    ArrayList<Album> getAll();

    Album getAlbumById(int id);

    void addAlbum(Album a);

    void updateAlbum(Album a, int id);

    void deleteAlbum(Album a);

    void addNummersToAlbum(ArrayList<Nummer> nummers, int albumnummer);

}
