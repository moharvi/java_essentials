package src1.tareas;

import java.util.Objects;

import libs.Input;

public class HelloWorldBond 	{
	
	public static void main(String[] args) {
		System.out.println("Introduzca su nombre: ");
		String StrName = Input.get_string();
		System.out.println("hello, World, Mr "+ StrName ); 
		validator(StrName);
	}
	
	public static void validator(String StrNombre) {
		int i;
		if(Objects.equals(StrNombre, "James")) {
			System.out.println("You're Mr Bond");
			System.out.println("Bye, Bye Mr Bond");
			for(i=10; i >= 0; i--) {
				System.out.println(i);
			}
			System.out.println("BOOOMMMM!!!!");
		}
	}
}
