package src1.tareas;

import libs.Input;

public class MarioFacil {

	public static void main(String[] args) {
		System.out.println("¿Cuantos Niveles deseas que tenga la piramide?");
		int n = Input.get_int();
		Cons_Piramide(n);
	}
	
	public static void Cons_Piramide(int nivel) {
		for(int i = 0; i<=nivel; i++) {
			for(int j=0; j<nivel; j++) {
				if(j<(nivel-i)){
					System.out.print(" ");
				}
					else {
						System.out.print("#");
				}
				
			}
			System.out.println("");
		}
	}
}
