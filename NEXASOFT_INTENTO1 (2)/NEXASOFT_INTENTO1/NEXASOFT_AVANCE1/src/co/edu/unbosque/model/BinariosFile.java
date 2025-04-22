package co.edu.unbosque.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class BinariosFile {

	private static File archivo;//Crea el archivo 
	private static final String FOLDER_NAME = "data";//Crea el archivo binario
	private static FileOutputStream fos;//FileOutputStream crea el archivo binario, ingresar 
	private static ObjectOutputStream oos;//Escribe sobre el archivo
	private static FileInputStream fis;//Convierte los datos binarios para retornarlos normales
	private static ObjectInputStream ois;//lee sobre el archivo binario
	/*
	 * ADIOS
	 */
	public static void checkFolder() {//Verifica de la carpeta existe

		archivo = new File(FOLDER_NAME);//crea la carpeta

		if (archivo.exists()&& archivo.isDirectory()) {//Pregunta si existe y si es un directorio

			return;//Se sale si la condicion se cumple
		}else { //Si no se cumple entonces se crea una carpeta 
			archivo.mkdir();
		}
	}

	public static void escribirSerializado(String url, Object content) {

		try {
			archivo = new File(FOLDER_NAME + "/" + url);

			if(!archivo.exists()){
				archivo.createNewFile();
			} fos = new FileOutputStream(archivo);//Convierte el archivo a binario 
			oos = new ObjectOutputStream(fos);//Donde este fos va a escribir el archivo en binario 
			oos.writeObject(content);//esta escribiendo en binario con el contenido que se le envie 

			fos.close();
			oos.close();//Se cierra para no generar excepciones

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Object leerSerializado(String url) {

		archivo = new File(FOLDER_NAME+ "/" + url);
		try {
			if(!archivo.exists()) {
				archivo.createNewFile();
			} 
			fis = new FileInputStream(archivo);//busca el archivo y loo crea como binario 
			ois = new ObjectInputStream(fis);//lee el archivo 
			Object content = ois.readObject();// Lo que obtiene dentro del archivo lo pone en la variable content

			fis.close();
			ois.close();

			return content;

		} catch (ClassNotFoundException e) {
			System.out.println("Error al leer el archivo serializado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error al leer el archivo serializado");
			e.printStackTrace();
		}
		return null;

	}

	}

