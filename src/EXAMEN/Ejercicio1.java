package EXAMEN;

import java.util.Scanner;

/**
 * Ejercicio 1. Introducir pesos de 30 boxeadores, sacar por pantalla a que
 * categoria pertenecen. Si no introducimos numeros o son fuera de rango
 * terminamos con excepcion.
 * 
 * @author Aritz Campo
 *
 */
public class Ejercicio1 {
	
	final static int PESO_MOSCA = 52;
	final static int PESO_PLUMA = 57;
	final static int PESO_LIGERO = 64;
	final static int PESO_MEDIANO = 90;
	

	public static void main(String[] args) {
		// inicializo variables
		Scanner sc = new Scanner(System.in);
		int pesoBoxeador;
		//hacemos lo mismo para 30 boxeadores diferentes
		for (int i = 1; i <= 30; i++) {
			System.out.println("INTRODUZCA PESO DEL BOXEADOR " + i + ":  ");
			
			// recojo el peso del boxeador
			try {
				// capturo la excepcion por si no mete un entero
				pesoBoxeador = sc.nextInt();
				// controlo que meta un rango de numeros correcto y saco por pantalla. Sino
				// lanzo excepcion
				if (pesoBoxeador > 0 && pesoBoxeador < PESO_MOSCA) {
					System.out.println("PESO MOSCA");
				} else if (pesoBoxeador >= PESO_MOSCA && pesoBoxeador <= PESO_PLUMA) {
					System.out.println("PESO PLUMA");

				} else if (pesoBoxeador > PESO_PLUMA && pesoBoxeador <= PESO_LIGERO) {
					System.out.println("PESO LIGERO");

				} else if (pesoBoxeador > PESO_LIGERO && pesoBoxeador <= PESO_MEDIANO) {
					System.out.println("PESO MEDIANO");

				} else if (pesoBoxeador > PESO_MEDIANO) {
					System.out.println("PESO PESADO");

				} else {
					i = 30;
					throw new Exception("Ha introducido datos sin el formato indicado o fuera del rango");
					
				}
			} catch (Exception e) {
				System.out.println("Ha introducido datos sin el formato indicado o fuera del rango");
			}
		}

		sc.close();
	}

}
