package week5.practicum4;

import java.io.*;

public class KlasManager {

	public void klasOpslaan(Klas deKlas) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("klas.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(deKlas);
		oos.close();
		/* Voeg hier code toe om parameter 'deKlas' in bestand klas.obj */
	}

	public Klas klasInladen() throws IOException, ClassNotFoundException {
		Klas deKlas = null;
		
		FileInputStream fis = new FileInputStream("klas.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		/* Voeg hier code toe om het Klas-object weer in te lezen uit bestand klas.obj */

		Object obj = ois.readObject();
		deKlas = (Klas) obj;
		ois.close();
		
		/* Laat variabele 'deKlas' naar het ingelezen Klas object wijzen! */

		return deKlas;
	}
}
