package src2.tareas;

import libs.Input;

public class InicialesDificil {

	public static void main(String[] args) {
		
		System.out.println("Escribe tu nombre: ");
		String nombre = Input.get_string(); 
		iniciales(nombre);
		}
	public static void iniciales(String iniciales) {
		String NOMBRE = iniciales.toUpperCase();
		String NOMBRESinEsp = NOMBRE.replaceAll(" ", ",");
		String[] arrayNombre = NOMBRESinEsp.split(",");
		 
		for (int i = 0; i < arrayNombre.length; i++) {
			if(arrayNombre[i].length() > 0) {
				arrayNombre[i] = arrayNombre[i].trim();
				/*System.out.print(i);
				System.out.println(" " + arrayNombre[i]);*/
				System.out.print(arrayNombre[i].charAt(0));
			}
		}
	}
}
