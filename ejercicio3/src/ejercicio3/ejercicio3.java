package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// EJERCICIO 1

				Scanner entrada = new Scanner(System.in);// ESTE SCANNER SIRVE PARA Todo el ejercicio ATENTO

				System.out.println("Escribe la edad que tienes ");
				int edad = entrada.nextInt();

				if (edad >= 18)

				{

					System.out.println("Como tienes " + edad + " años, eres mayor de edad");

				}

				// EJERCICIO 2

				System.out.println("Escribe la edad que tienes ");
				int edad2 = entrada.nextInt();

				if (edad2 >= 18) 
				
				{

					System.out.println("Como tienes " + edad2 + " años, eres mayor de edad");

				} 
				
				else

				{

					System.out.println("Como tienes " + edad2 + " años, no eres mayor de edad");
				
				}

				// EJERCICIO 3

				for (int i = 1; i <= 20; i++)

				{

					System.out.println(i);

				}

				// EJERCICIO 4

				for (int i = 2; i <= 200; i+=2) //EDIponer += para saber de cuantas unidades vamos sumando

				
				{
					
					System.out.println(i);

				}
				
				//EJERCIO 5

				for(int i = 1 ; i <=200 ; i ++)
					
					if (i % 2 == 0)//% es lo mismo que que el resto de i/2 (en este caso) tiene q ser 0
			
				{
				
					System.out.println(i);
				
				}

			
				//EJERCICIO 6

				System.out.println("Introduce el numero hasta donde quieres "
						+ " que vaya el contador ");
				
				int n = entrada.nextInt();
				
				
				for(int i = 1 ; i <= n ; i++)
					
				{

					System.out.println(i);
				
				}



				//EJERCICIO 7 
				
				System.out.println("Introduce una nota del 1 al 10");
					
				int notaex  =  entrada.nextInt();
				
					
					if(notaex < 3) 
						
				{
						
						System.out.println("Tu nota es muy deficiente");
						
				}
					
					else if(notaex < 5)
						
				{		
						
						System.out.println("Tu nota es insuficiente");
					
				}
					
					else if(notaex < 6)
						
				{
						
						System.out.println("Tu nota es bien");
						
				}
			
					else if(notaex < 9)
					
				{
					
						System.out.println("Tu nota es notable");
						
				}
					
					else
					
				{
				
						System.out.println("Tu nota es sobresaliente");
						
				}

				
				//EJERCICIO 8
					
				double num2;	
				
				System.out.println("Introduce un numero positivo");
				num2 = entrada.nextDouble();
				
				double factou = 1;
				for(int i = 1 ; i <= num2 ; i++)	
				
				{
					
					factou = num2*i;
					System.out.println("El factorial del numero " + num2 + " es "
							+ (factou ));
					
				}
			
				
				//EJERCICO 9
				
				double hora;
				double min;
				double seg;
				double seg2;
				
				System.out.println("Escribe una hora expresada, expresada en horas min y seg a continuacion");
				
				System.out.println("Escribe la hora");
				hora = entrada.nextDouble();
				
				System.out.println("Escribe los minutos");
				min = entrada.nextDouble();
				
				System.out.println("Escribe los segundos");
				seg = entrada.nextDouble();
				
				
				seg2 = seg + 1;
				
				if (seg2 >= 60)
				
				{
					
					min = min + 1;
					seg2 = 0;
					
				}
				
				if (min >= 60)
					
				{
					
					hora = hora +1;
					min = 0;
					
				}
				
				
				System.out.println("La hora introducida sumando un segundo es " + (hora) + (min) + (seg2 ) );
				
				
				//EJERCICIO 10
				
				
				double num_1;
				double num_2;
				double num_3;
				double num_4;
				double num_5;
				double num_6;
				double num_7;
				double num_8;
				double num_9;
				double num_10;
			
				System.out.println("Escribe 10 numeros no nulos");
				num_1 = entrada.nextDouble();
				num_2 = entrada.nextDouble();
				num_3 = entrada.nextDouble();
				num_4 = entrada.nextDouble();
				num_5 = entrada.nextDouble();
				num_6 = entrada.nextDouble();
				num_7 = entrada.nextDouble();
				num_8 = entrada.nextDouble();
				num_9 = entrada.nextDouble();
				num_10 = entrada.nextDouble();
				
				
				if(num_1 =< 0)
				
}
