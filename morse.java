package morse;

import java.util.Scanner;

public class morse {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		char[] letras = {
				' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
				'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
		String[] Morse = {
				"   ", "._", "_...", "_._.", "_..", ".", ".._.", "__.", "....", "..", ".___", 
				"_._", "._..",  "__", "_.", "___", ".__.", "__ . _", "._.", "...", "_", ".._", 
				"..._", ".__", "_.._", "_.__", "__..", ".____", "..____", "...__", 
				"...._", ".....", "_....", "__...", "___..", "____.", "_____"};
		String Cambiar_Morse = "";
		String siguiente_Texto = "";
		String Cambiar = "";
		String siguiente_Morse = "";
		
		int a;
		Scanner S = new Scanner(System.in);
		
		do {
			System.out.println("1 Texto a Morse");
			System.out.println("2 Morse a texto ");
			System.out.println("3 Salir");
			a = S.nextInt();
			
		}while(a>3);
		
		switch (a) {
		case 1:
			System.out.println("Inserta la frase que quieras cambiar");
			Cambiar_Morse = input.nextLine();
			
			Cambiar_Morse = Cambiar_Morse.toLowerCase();
			
			for (int i = 0; i< Cambiar_Morse.length();i++ ) {
				for(short j = 0; j<37; j++) {
					if(Cambiar_Morse.charAt(i) == letras[j]) {
						siguiente_Texto += Morse[j];
						siguiente_Texto += "/";
						
						break;
					}
				}
				
			}
			
			System.out.print("Codigo Morse:");	
			System.out.print(siguiente_Texto);	
			break;
		case 2:
			System.out.println("Inserta la frase que quieras cambiar");
			Cambiar = input.nextLine();
			
			Cambiar = Cambiar.toLowerCase();
			
			String oracion[] = Cambiar.split("/");
			int todo= oracion.length;
			
			for (int i = 0; i< todo;i++ ) {
				for(int j = 0; j<37; j++) {
					if(oracion[i].equals(Morse[j])) {
					
						siguiente_Morse += letras[j];
						break;
					}
				}
			}
			System.out.print("Codigo Morse:");	
			System.out.print(siguiente_Morse);
			break;
		case 3:
			System.out.print("saliendo");
			break;
		}

	}

}
