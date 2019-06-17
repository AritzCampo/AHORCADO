package EXAMEN;

import java.util.Scanner;

/**
 * PEdir los puntos de un participante. Si los puntos son mas de 70 decimos que
 * puede ganar el mundial y si no no. Utilizamos una funcion para ello.
 * 
 * @author Aritz Campo
 *
 */
public class Ejercicio2 {
	/**
	 * Funcion Ganar, calcula si ganamos en funcion de los puntos obtenidos
	 * 
	 * @param x int. Numero de puntos introducidos por el usuario
	 * @return boolean, verdadero o falso si puede ganar el campeonato
	 */
	public static boolean ganar(int x) {
        boolean ganar = false;
		if (x >= 70) {
			ganar = true;
		} else {
			ganar = false;
		}
		return ganar;
	}

	public static void main(String[] args) {
		// Inicializo variables
		Scanner sc = new Scanner(System.in);
		int puntosPiloto = 0;
		// Pido los datos
		System.out.println("INTRODUZCA PUNTOS :  ");
		puntosPiloto = sc.nextInt();
		// llamo a la funcion para q calcule si puedo ganar
		if (ganar(puntosPiloto)) {
			System.out.println("Puedes ganar el campeonato");
		} else {
			System.out.println("Ponte las pilas si quieres ganar");
		}
		sc.close();

	}

}
