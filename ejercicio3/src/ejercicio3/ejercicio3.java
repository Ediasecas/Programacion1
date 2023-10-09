package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada  = new Scanner(System.in);//ESTE SCANNER SIRVE PARA Todo el ejercicio ATENTO
		
		System.out.println("Escribe la edad que tienes ");
		
		int edad  =  entrada.nextInt();
					
		if (edad >= 18);
		{
		System.out.println("Como tu edad es " + edad +"eres mayor de edad");
		} 
		else
							
		{
		System.out.println("Como tu edad es " + edad + " no eres mayor de edad");
		}
	}

}
