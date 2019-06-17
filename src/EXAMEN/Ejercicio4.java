package EXAMEN;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//declaracion de variables
		Scanner sc = new Scanner(System.in);
		Tren tren = new Tren();
        //pedimnos datos para crear el tren
		System.out.println("INTRODUZCA TIPO DE TREN");
		tren.setTipo(sc.nextLine());
		System.out.println("INTRODUZCA REFERENCIA DE TREN");
		tren.setReferencia(sc.nextInt());
		System.out.println("INTRODUZCA BILLETES VENDIDOS");
		tren.setAsientosOcupados(sc.nextInt());
		System.out.println("INTRODUZCA AÑOS DEL TREN");
		tren.setAñosActivo(sc.nextInt());
		//enseñamos el tren introducido
		System.out.println("ESTE ES EL TREN INTRODUCIDO : ");
		System.out.println(tren.toString());
		//coprobamos si el tren esta lleno
		if (tren.trenLleno()) {
			System.out.println("EL TREN ESTA COMPLETO");
		}else {
			System.out.println("EL TREN NO ESTA COMPLETO");
		}
		//comprobamos si el tren es demasiado viejo o no
		System.out.println(tren.demasiadoViejo());
        sc.close();
       
	}

}
