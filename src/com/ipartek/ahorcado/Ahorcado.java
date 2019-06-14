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
	public static String [] PALABRAS = {
			"parafilia","moneda","esternocleidomastoideo","repositorio","redrum"};
	
    private static boolean mirarSiTerminado (char[] a){
    	boolean terminado = true;
    	for (int i = 0; i <= a.length - 1; i++) {// inicializo la palabra en blanco
			if (a[i] == '_') {
				terminado = false;
				break;
			}
		}
    	return terminado;
    }
    
	public static void main(String[] args) {
		

		int vidas = VIDAS;
		boolean acertado = false;
		boolean aciertoSi = false;
		
		
		
		System.out.println("A ver si adivinas la palabra");
		Scanner sc = new Scanner(System.in);
		// elijo la palabra al azar
		String palabraSeleccionada = PALABRAS[(int) Math.floor(Math.random()*PALABRAS.length)];

		// genero un array de char para trabajar
		char[] palabraEnArray = palabraSeleccionada.toCharArray();

		// saco el tamano de la palabra para el control
		int tamaño = palabraSeleccionada.length();
		//int acierto = 0;
		char aux[] = new char[tamaño];// declaro auxiliar para ir completando
		for (int i = 0; i <= tamaño - 1; i++) {// inicializo la palabra en blanco
			aux[i] = '_';
		}
		String letraString;
		char arrayLetra[] = new char[0];
		char letraIntroducida;
		System.out.print("PALABRA :  ");
		for (int i = 0; i <= tamaño - 1; i++) {// saco la palabra por pantalla
			System.out.print(aux[i]+" ");
		}
		
		while (!acertado && vidas > 0) {

			System.out.println("\nIntroduce letra : ");
			letraString = sc.nextLine();
			letraString = letraString.toLowerCase();
			
			if (letraString.length() > 1) {
				System.out.println("SOLO UNA LETRA POR FAVOR");
			} else {
				arrayLetra = letraString.toCharArray();
				letraIntroducida = arrayLetra[0];
				for (int i = 0; i <= tamaño - 1; i++) {
					if (palabraEnArray[i] == letraIntroducida) {
						aux[i] = letraIntroducida;
						aciertoSi = true;
					}
				}
				for (int i = 0; i <= tamaño - 1; i++) {// saco la palabra por pantalla
					System.out.print(aux[i]+" ");
				}
				if (aciertoSi) {
					acertado = mirarSiTerminado(aux);
					/*if (Arrays.equals(aux, palabraEnArray)) {
						acertado = true;
					}*/
					aciertoSi = false;
				} else {
					vidas--;
					if (vidas > 0) {
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
