package src2.tareas;

import java.util.ArrayList;
import libs.Input;

public class CifradoCesar {

	public static void main(String args[])
	{
		System.out.println("Introduce el texto a cifrar");
		String str = Input.get_string();  // or anything else

	    ArrayList<Integer> charsList = new ArrayList<Integer>();
	    for (char c : str.toCharArray()) {
	    	charsList.add(((int)c)+13);
	    	//System.out.print(((int)c)+1);
	    }
	    System.out.println(" ");
	    for(int i : charsList) {
	    	char c = (char)i;
	    	System.out.print(c);
	    }
	 
	    
	}
	
}
