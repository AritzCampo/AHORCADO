package EXAMEN;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Intorducir 10 numero por teclado y obtener cuantos son multiplos de 7 y la
 * media aritmetica
 * 
 * @author Aritz Campo
 *
 */
public class Ejercicio3 {
    //declaramos constantes para que se pueda cambiar la longitud del 
	// array y el numero que queremos saber si son multilplos mas facimente
	final static int LONGITUD_ARRAY = 10;
	final static int MULTIPLOS_DE = 7;

	public static void main(String[] args) {
        //declaracion de variables
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int suma = 0;
		float mediaAritmetica;
		//declaracion de formato float para q saque solo dos decimales
		DecimalFormat formato1 = new DecimalFormat("#.00");

		int[] arrayNumeros = new int[LONGITUD_ARRAY];
		//rellenamos array
		for (int i = 0; i < LONGITUD_ARRAY; i++) {
			System.out.println("introduzca numero :  ");
			arrayNumeros[i] = sc.nextInt();
		}
		//sacamos la cantidad de multiplos que haya
		for (int i = 0; i < LONGITUD_ARRAY; i++) {

			if ((arrayNumeros[i] % MULTIPLOS_DE) == 0) {
				cont++;
			}
		}
		System.out.println("HAY " + cont + " MULTIPLOS DE " + MULTIPLOS_DE);
        //sumamos para obtrener la media desoues de recorrer el array
		for (int i = 0; i < LONGITUD_ARRAY; i++) {

			suma = arrayNumeros[i] + suma;

		}
		mediaAritmetica = (float) suma / LONGITUD_ARRAY;
		System.out.println("LA MEDIA ARITMETICA DE LOS NUMEROS INTRODUCIDOS ES :  " + formato1.format(mediaAritmetica));
		sc.close();
	}

}
