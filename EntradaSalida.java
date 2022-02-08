package complementos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EntradaSalida {
	public static void main(String[] args) {
		
		//Esto es un try (Comentario de Sergio)
		try {
		String ruta="C:\\Users\\Roba\\Desktop\\Carpeta Trabajo Inicial\\salida.txt";
		String contenido="Contenido de ejmplo \nsegunda prueba";
		
		File file= new File(ruta);
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		FileWriter fw= new FileWriter(file);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write(contenido);
		bw.write("\nhola");
		bw.close();
		
		}
		 catch (IOException e) {
			e.printStackTrace();
		}
	}
}
