 package complementos;

public class Principal {

	public static void main(String[] args) {
		
		int[] array=new int[20];
		
		try {
			array[-3]=24;
		}
//		catch(Exception e) { //te va a decir la expecion por defecto
//			System.out.print(e);
//		}
	
		catch(ArrayIndexOutOfBoundsException e){ //aqui la ponemos nosotros
		System.out.println("Index -3 out of bounds for length 20");
		}
		
		
		finally {
		System.out.println("Ingresa en el finally"); //esto se hace siempre 
		}
		
	}

}
