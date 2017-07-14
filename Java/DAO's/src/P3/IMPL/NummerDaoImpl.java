package P3.IMPL;

import P3.DAO.BaseDao;
import P3.Models.Album;
import P3.Models.Nummer;
import java.sql.*;
import java.util.ArrayList;

public class NummerDaoImpl extends BaseDao {
    private Connection conn = super.getConnection();
    private static AlbumDaoImpl adi = new AlbumDaoImpl();

    public ArrayList<Nummer> getAll() {

        try {

            ArrayList<Nummer> nummers  = new ArrayList<Nummer>();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM NUMMER");

            while (rs.next()) {
                Nummer nummer = new Nummer(rs.getInt("ID"),rs.getString("TITEL"));
                nummer.setAlbums(adi.getAlbumsByNummerId(rs.getInt("ID")));
                nummers.add(nummer);
            }

            // De resultset, het statement en de verbinding sluiten
            rs.close();
            stmt.close();
            return nummers;
        } catch (SQLException s){
            s.printStackTrace();
            return null;
        }


    }

    public Nummer getNummerById(int id) {


        try {
            PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM NUMMER WHERE ID = ?");
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            rs.next();

            Nummer nummer = new Nummer(rs.getInt("ID"),rs.getString("TITEL"));
            nummer.setAlbums(adi.getAlbumsByNummerId(nummer.getId()));

            // De resultset, het statement en de verbinding sluiten
            rs.close();
            preparedStatement.close();
            return nummer;

        } catch (SQLException s){
            s.printStackTrace();
            return null;
        }

    }

    public ArrayList<Nummer> getNummmersByAlbumId(int id){

        try {
            ArrayList<Nummer> nummers = new ArrayList<Nummer>();

            PreparedStatement preparedStatement = conn.prepareStatement("SELECT n.* FROM NUMMER n JOIN ALBUM_NUMMER an ON (an.NUMMER_ID = n.ID) WHERE an.ALBUM_ID = ?");
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                Nummer nummer = new Nummer(rs.getInt(1), rs.getString(2));
                nummers.add(nummer);

            }

            // De resultset, het statement en de verbinding sluiten
            rs.close();
            preparedStatement.close();
            return nummers;
        } catch (SQLException s){
            s.printStackTrace();
            return null;
        }

    }

    public void addNummer(Nummer n, Album a) {

        try {
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO NUMMER VALUES (?,?)");
            preparedStatement.setInt(1, n.getId());
            preparedStatement.setString(2, n.getTitel());

            // execute insert SQL stetement
            preparedStatement.executeUpdate();

            preparedStatement.close();

        } catch (SQLException s){
            s.printStackTrace();
        }

    }

    public void updateNummer(Nummer n, int id) {


        try {
            PreparedStatement preparedStatement = conn.prepareStatement("UPDATE NUMMER SET ID = ?, TITEL = ? WHERE ID = ?");
            preparedStatement.setInt(1, n.getId());
            preparedStatement.setString(2, n.getTitel());
            preparedStatement.setInt(3,id);
            // execute insert SQL stetement
            preparedStatement.executeUpdate();

            preparedStatement.close();

        } catch (SQLException s){
            s.printStackTrace();
        }

    }

    public void deleteNummer(Nummer n) {

        try {
            String deleteSQL = "DELETE NUMMER WHERE ID = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(deleteSQL);
            preparedStatement.setInt(1, n.getId());
            // execute delete SQL stetement
            preparedStatement.executeUpdate();

            preparedStatement.close();

        } catch (SQLException s){
            s.printStackTrace();
        }

    }

    public void addAlbumsToNummer(ArrayList<Album> albums, int nummer){

        try {
            PreparedStatement preparedStatement = null;
            for (Album a : albums) {

                preparedStatement = conn.prepareStatement("INSERT INTO ALBUM_NUMMER VALUES (?,?)");
                preparedStatement.setInt(1, a.getAlbumnummer());
                preparedStatement.setInt(2, nummer);

                // execute insert SQL stetement
                preparedStatement.executeUpdate();


            }
            preparedStatement.close();
        } catch (SQLException s){
            s.printStackTrace();
        }
    }

}