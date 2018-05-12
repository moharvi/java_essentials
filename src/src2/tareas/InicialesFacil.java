package src2.tareas;

import libs.Input;

public class InicialesFacil {

	public static void main(String[] args) {
		
		System.out.println("Escribe tu nombre: ");
		String nombre = Input.get_string(); 
		String NOMBRE = nombre.toUpperCase();
		String[] arrayNombre = NOMBRE.split(" ");
		 
		for (int i = 0; i < arrayNombre.length; i++) {
			System.out.print(arrayNombre[i].charAt(0));
		}
	}
}
