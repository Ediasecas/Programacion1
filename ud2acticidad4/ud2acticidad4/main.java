package ud2acticidad4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner(System.in);
		
	
		//EJERCICIO 1
						
		double numeros[] = new double [10];
		for(int i=0 ; i<10 ; i++)

		{
		
			System.out.println("Introduce el numero " + (i+1));
			numeros[i] = entrada.nextDouble();
		
		}
	
		for (int i = 0 ; i<numeros.length ; i++)
			
		{
			
			System.out.println(numeros[i]);
			
		}
	
	
		
		//EJERCICIO 2
	
		double suma = 0;
		
		double numeros1[] = new double [10];
		
		for(int i=0 ; i<10 ; i++)

		{
		
			System.out.println("Introduce el numero " + (i+1));
			numeros1[i] = entrada.nextDouble();
		
		}
	
		for(int i = 0 ; i<numeros1.length ; i++)
		
		
		{
			
			suma += numeros1[i];

			
		}
		
		System.out.println("La suma de todos sus valores es " + suma );
		
		
		
		//EJERCICO 3
		
		double nummin = Integer.MAX_VALUE;
		double nummax = Integer.MIN_VALUE;
		
		double numeros2[] = new double [10];
		
		for(int i=0 ; i<10 ; i++)

		{
		
			System.out.println("Introduce el numero " + (i+1));
			numeros2[i] = entrada.nextDouble();
			
		}
	
		for(int i = 0; i<numeros2.length ; i++)
			
		{
			
			nummin = Math.min(numeros2[i], nummin);
			nummax = Math.max(numeros2[i], nummax);
		
		}
		
		System.out.println("El numero minimo es " + nummin );
		System.out.println("El numero maximo es " + nummax);
		
		
		
		//EJERCICIO 4
		
		int sumaposit = 0 ;
		int sumaneg = 0 ;
		
		int numeros3[] = new int [10];
		
		for(int i=0 ; i<10 ; i++)

		{
		
			System.out.println("Introduce el numero " + (i+1));
			numeros3[i] = entrada.nextInt();
		
		}
	
		for(int i=0 ; i < numeros3.length ; i++)
		
		{
			
			if (numeros3[i] > 0)
			
			{
				
				sumaposit += numeros3[i];
				
			}
			
			else 
			
			{
			
				
				sumaneg += numeros3[i];
			}
			
		}
		
		
		System.out.println("La suma de los numeros positivos introducidos es " + sumaposit);
		System.out.println("La suma de los numeros negativos introducidos es " + sumaneg);
		
		
		
		//EJERCICIO 5
		
		double suma2 = 0;
		double media = 0;
		
		double numeros4[] = new double [10];
		
		for(int i=0 ; i<10 ; i++)

		{
		
			System.out.println("Introduce el numero " + (i+1));
			numeros4[i] = entrada.nextDouble();
		
		}
	
		for(int i = 0 ; i < numeros4.length ; i++)
		
		
		{
			
			suma2 += numeros4[i];
			
			media = suma2 / numeros4[i];
			
		}
		
		System.out.println("La media de los numeros introducidos " + media);
		
		
		
		//EJERCICIO 6
		
		System.out.println("Introduce el numero N ");
		int numN = entrada.nextInt();
		
		System.out.println("Introduce el numero M ");
		int numM = entrada.nextInt();
		
		int numa[] = new int[numN];
		
		for (int i = 0 ; i < numa.length ; i++)
		
		{
			
			numa[i] = numM;
			System.out.println("El numero M en todas sus posiciones es " + numa[i]);
			
		}
		
	
		
		//EJERCICIO 7
		
		System.out.println("Introduce el numero P ");
		int numP = entrada.nextInt();
		
		System.out.println("Introduce el numero Q ");
		int numQ = entrada.nextInt();
		
		int numc = Arrays.fill(numP,numQ);
		
		for (int i = 0 ;  i < numb.length ; i++)
		
		{
			
			numb[numP] = numQ;
			
		}
		
		
	}//cuerpo del ejerdda

}
