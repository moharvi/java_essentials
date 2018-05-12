package src1.tareas;

import libs.Input;

public class MarioDificil {

	public static void main(String[] args) {
		System.out.println("¿Cuantos Niveles deseas que tenga la piramide?");
		int n = Input.get_int();
		Cons_Piramide(n);
	}
	
	public static void Cons_Piramide(int nivel) {
		int espaciosBlancos;
		for(int i = 0; i<=nivel; i++) {
			espaciosBlancos = nivel-i;
			for(int j=0; j<nivel; j++) {
				if(j<(espaciosBlancos)){
					System.out.print(" ");
				}else {
						System.out.print("#");
				}
				
			}
			System.out.print(" ");
			for(int j=0; j<nivel; j++) {
				if(j<(nivel-espaciosBlancos)){
					System.out.print("#");
				}else {
						System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
