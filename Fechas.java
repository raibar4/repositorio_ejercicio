package complementos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fechas {

	public static void main(String[] args) {
		
		Date objDate= new Date();
		
		String formato="hh: mm: ss a dd-MM-yyyy";
		
		SimpleDateFormat objSDF= new SimpleDateFormat(formato);
		
		System.out.println(objDate.toString());
		System.out.println(objSDF.format(objDate));
		

	}

}
