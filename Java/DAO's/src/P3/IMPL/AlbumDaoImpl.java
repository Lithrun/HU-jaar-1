package P3.IMPL;

import P3.DAO.BaseDao;
import P3.Models.Album;
import P3.Models.Nummer;

import java.sql.*;
import java.util.ArrayList;


public class AlbumDaoImpl extends BaseDao {
    private Connection conn = super.getConnection();
    private static NummerDaoImpl ndi = new NummerDaoImpl();

    public ArrayList<Album> getAll() {

        try {
            ArrayList<Album> albums = new ArrayList<Album>();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ALBUM");


            while (rs.next()) {
                Album album = new Album(rs.getInt("ID"), rs.getString("NAAM"), rs.getDate("UITGEEF_DATUM"));
                album.setNummers(ndi.getNummmersByAlbumId(rs.getInt("ID")));
                albums.add(album);
            }


            // De resultset, het statement en de verbinding sluiten
            rs.close();
            stmt.close();
            return albums;
        } catch (SQLException s){
            s.printStackTrace();
            return null;
        }

    }

    public ArrayList<Album> getAlbumsByNummerId(int id){

        try {
            ArrayList<Album> albums = new ArrayList<Album>();

            PreparedStatement preparedStatement = conn.prepareStatement("SELECT a.* FROM ALBUM a JOIN ALBUM_NUMMER n ON (n.ALBUM_ID = a.ID) WHERE NUMMER_ID = ?");
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                Album album = new Album(rs.getInt(1), rs.getString(2), rs.getDate(3));
                albums.add(album);

            }

            // De resultset, het statement en de verbinding sluiten
            rs.close();
            preparedStatement.close();
            return albums;
        } catch (SQLException s){
            s.printStackTrace();
            return null;
        }

    }

    public Album getAlbumById(int id) {

        try {
            PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM ALBUM WHERE ID = ?");
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            rs.next();



            Album album = new Album(rs.getInt("ID"), rs.getString("NAAM"), rs.getDate("UITGEEF_DATUM"));
            album.setNummers(ndi.getNummmersByAlbumId(rs.getInt("ID")));

            // De resultset, het statement en de verbinding sluiten
            rs.close();
            preparedStatement.close();
            return album;
        } catch (SQLException s){
            s.printStackTrace();
            return null;
        }

    }

    public void addAlbum(Album a){


        try {

            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO ALBUM VALUES (?,?,?)");
            preparedStatement.setInt(1, a.getAlbumnummer());
            preparedStatement.setString(2, a.getNaam());
            preparedStatement.setDate(3, a.getUitgeefdatum());

            // execute insert SQL stetement
            preparedStatement .executeUpdate();

            preparedStatement.close();

        } catch (SQLException s){
            s.printStackTrace();
        }

    }

    public void updateAlbum(Album a, int id){


        try {

            PreparedStatement preparedStatement = conn.prepareStatement("UPDATE ALBUM SET ID = ?, NAAM = ?, UITGEEF_DATUM = ? WHERE ID = ?");
            preparedStatement.setInt(1, a.getAlbumnummer());
            preparedStatement.setString(2, a.getNaam());
            preparedStatement.setDate(3, a.getUitgeefdatum());
            preparedStatement.setInt(4,id);

            // execute insert SQL stetement
            preparedStatement .executeUpdate();

            preparedStatement.close();

        } catch (SQLException s){
            s.printStackTrace();
        }

    }

    public void deleteAlbum(Album a){

        try {

            PreparedStatement preparedStatement = conn.prepareStatement("DELETE ALBUM WHERE ID = ?");
            preparedStatement.setInt(1, a.getAlbumnummer());
            // execute delete SQL stetement
            preparedStatement.executeUpdate();

            preparedStatement.close();

        } catch (SQLException s){
            s.printStackTrace();
        }

    }

    public void addNummersToAlbum(ArrayList<Nummer> nummers, int albumnummer){

        try {

            PreparedStatement preparedStatement = null;
            for (Nummer n : nummers) {

                preparedStatement = conn.prepareStatement("INSERT INTO ALBUM_NUMMER VALUES (?,?)");
                preparedStatement.setInt(1, albumnummer);
                preparedStatement.setInt(2, n.getId());

                // execute insert SQL stetement
                preparedStatement.executeUpdate();


            }
            preparedStatement.close();
        } catch (SQLException s){
            s.printStackTrace();
        }

    }

}
