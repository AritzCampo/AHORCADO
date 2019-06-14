package com.ipartek.ahorcado;

import java.util.Scanner;

/**
 * Juego del ahorcado sin interfaz grafica. Pregunta por una palabra letra a
 * letra hasta que acertamos o perdemos todas las vidas
 * 
 * @author Aritz
 *
 */
public class Ahorcado {
	
	public static int VIDAS = 7;
	public static String[] PALABRAS = { "silla", "moneda", "bilbao", "mesa", "redrum" };

	/**
	 * fUNCION QUE CONTROLA QUE NO HAYA _ Y ASI SABER SI HEMOS TERMINADO
	 * 
	 * @param a ARRAY DE CHAR PARA COMPROBAR
	 * @return BOOLEAN PARA INFORMAR SI HEMOS TERMINADO
	 */
	private static boolean mirarSiTerminado(char[] a) {
		boolean terminado = true;
		for (int i = 0; i <= a.length - 1; i++) {// COMPRUEBO QUE NO HAYA '_'
			if (a[i] == '_') {
				terminado = false;
				break;
			}
		}
		return terminado;
	}

	public static void main(String[] args) {

		// DECLARACION VARIABLES
		int vidas = VIDAS;
		boolean acertadoPalabra = false;
		boolean aciertoLetra = false;
		String letraString;
		char arrayLetra[] = new char[0];
		char letraIntroducida;
		Scanner sc = new Scanner(System.in);

		// elijo la palabra al azar
		String palabraSeleccionada = PALABRAS[(int) Math.floor(Math.random() * PALABRAS.length)];
		// genero un array de char para trabajar
		char[] palabraEnArray = palabraSeleccionada.toCharArray();

		// saco el tamano de la palabra para el control
		int tamaño = palabraSeleccionada.length();

		char aux[] = new char[tamaño];// declaro auxiliar para ir completando

		System.out.println("A ver si adivinas la palabra");

		// inicializo la palabra en blanco
		for (int i = 0; i <= tamaño - 1; i++) {
			aux[i] = '_';
		}

		System.out.print("PALABRA :  ");

		// saco la palabra por pantalla
		for (int i = 0; i <= tamaño - 1; i++) {
			System.out.print(aux[i] + " ");
		}

		while (!acertadoPalabra && vidas > 0) { // MIENTRAS NO ACIERTE Y TENGA VIDAS A JUGAR

			System.out.println("\nIntroduce letra : ");
			letraString = sc.nextLine();
			letraString = letraString.toLowerCase();// RECOGEMOS LETRA Y PASAMOS A MINUSCULAS

			if (letraString.length() > 1) {// COMPROBAMOS QUE SOLO SEA 1 LETRA
				System.out.println("SOLO UNA LETRA POR FAVOR");
			} else {
				arrayLetra = letraString.toCharArray();
				letraIntroducida = arrayLetra[0];
				// RECORREMOS ARRAY PARA VER SI ESTA LA LETRA
				for (int i = 0; i <= tamaño - 1; i++) {
					if (palabraEnArray[i] == letraIntroducida) {
						aux[i] = letraIntroducida;
						aciertoLetra = true;
					}
				}

				// saco la palabra por pantalla
				for (int i = 0; i <= tamaño - 1; i++) {
					System.out.print(aux[i] + " ");
				}
				
				System.out.println("");//SALTO DE LINEA
				
				if (aciertoLetra) {// SI ACIERTO LA LETRA COMPRUEBO Q HAYA SIDO LA ULTIMA
					acertadoPalabra = mirarSiTerminado(aux);// FUNCION Q COMPRUEBA SI HEMOS TERMINADO
					aciertoLetra = false;
				} else {// SI NO HE ACERTADO LETRA LE QUITO UNA VIDA
					vidas--;
					if (vidas > 0) {// SI NO QUEDAN VIDAS FIN DE JUEGO
						System.out.println("UNA VIDA MENOS, PAQUETE!!!!");
						System.out.println("QUEDAN " + vidas + " VIDAS");
					} else {
						System.out.println("HAS PERDIDO");
						break;
					}
				}

			}

		}
		System.out.println("ENHORABUENA");

		sc.close();
	}

}
