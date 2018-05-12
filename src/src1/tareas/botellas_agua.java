package src1.tareas;

import libs.Input;

public class botellas_agua {

		public static void main(String args[]) {
			System.out.println("Introduzca el tiempo que tardo en la ducha: ");
			int min = Input.get_int();
			botellas(min);
		}
		
		public static void botellas(int min) {
			int botella = min *12;
			System.out.println("gastaste " + botella + " botellas de agua en tu ducha" );
			if(min > 10) {
				System.out.println("Reduce tu tiempo en la ducha, piensa en el mundo");
			}else if(min < 2) {
				System.out.println("Bañate bien, aún estas sucio");
			}
		}
}