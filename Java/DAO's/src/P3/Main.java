package P3;
// Vergeet deze import niet


import P3.DAO.NummerDao;
import P3.IMPL.AlbumDaoImpl;
import P3.IMPL.NummerDaoImpl;
import P3.Models.Album;
import P3.Models.Nummer;

import java.sql.*;
import java.util.ArrayList;

public class Main {
	// De methode die met JDBC aan de slag gaat moet een SQLException opvangen of gooien
	public static void main(String[] args) throws SQLException{

//		ArrayList<Album> albums = AlbumDaoImpl.getAlbumsByNummerId(conn, 38);
//
//		for (Album album : albums) {
//			System.out.println(album.getNaam());
//		}
//
//		System.out.println();
//		System.out.println("Alle nummers van ^ album..");
//		System.out.println();
//
//		ArrayList<Nummer> nummers = NummerDaoImpl.getNummmersByAlbumId(conn, 4);
//
//		for (Nummer nummer : nummers) {
//			System.out.println(nummer.getTitel());
//		}
		AlbumDaoImpl adi = new AlbumDaoImpl();
		NummerDaoImpl ndi = new NummerDaoImpl();


		ArrayList<Nummer> nummers = ndi.getAll();
		for (Nummer nummer : nummers) {
			System.out.println();
			System.out.println("Nummer: " + nummer.getId());
			for (Album album : nummer.getAlbums()) {
				System.out.println(album.getNaam());
			}
		}

		ArrayList<Album> albums = adi.getAll();
		for (Album album : albums) {
			System.out.println();
			System.out.println("Album: " + album.getAlbumnummer());
			for (Nummer nummer : album.getNummers()) {
				System.out.println(nummer.getTitel());
			}
		}

//		Album a = adi.getAlbumById(9);
//
//		System.out.println("Alle nummers van dit album");
//		for (Nummer n : a.getNummers()) {
//			System.out.println(n.getTitel());
//		}


//		Album a1 = adi.getAlbumById(4);
//		Album a2 = adi.getAlbumById(5);
//
//		ArrayList<Album> albumz = new ArrayList<Album>();
//		albumz.add(a1);
//		albumz.add(a2);
//
//		ndi.addAlbumsToNummer(albumz, 10);


	}
}