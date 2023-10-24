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
			System.out.println("El numero M en  sus posicion " + i + " es " + numa[i]);
			
		}
		
	
		
		//EJERCICIO 7
		
		
		int valoresenteros[]; //Valoresenteros[] es el array que almacena los valores introducidos P Y Q para comprobar quien es mayor
		
		System.out.println("Introduce el numero P ");
		int numP = entrada.nextInt();
		
		System.out.println("Introduce el numero Q ");
		int numQ = entrada.nextInt();
		
		int longitud;
		
		
		if (numP > numQ)
			
		{
			
				longitud = numP - numQ + 1; 
				valoresenteros = new int[longitud]; 
				
				for (int i = numP; i >= numQ; i--) 
	            
				{
	               
	            valoresenteros[numP - i] = i; 
	            System.out.println(valoresenteros[numP - i]+" , ");
	            	
	            } 
	            
	    } 
	        
		
		if (numQ > numP) 
		
		{ 
	            longitud = numQ - numP + 1; 
	            valoresenteros = new int[longitud];
	            
	            for (int i = numP; i <= numQ; i++) 
	            
	            {
	                
	            valoresenteros[i - numP] = i;
	            System.out.println(valoresenteros[i - numP]+" , ");
	                
	            }
	    } 
	       
		
		else 
		
		{ 
	           
				longitud = 1;
	            valoresenteros = new int[longitud];
	            valoresenteros[0] = numP;
	            
	    }
			
			
		
			//EJERCICIO 8
		
		
			double numrandom [] = new double [100];
		    double numR;
		    int numreales= 0;

		        for (int i=0; i < numrandom.length; i++) 
		        
		        {
		            
		        	numrandom [i] = Math.random();
		        	
		        }

		    System.out.println("Escribe un numero real R, entre 0.0 y 1.0:");	  
		    numR = entrada.nextDouble();

		    for (int i = 0; i < numrandom.length; i++) 
		    
		    {
		        
		    	if (numR >= numrandom[i]) 
		        
		        {
		           
		        	numreales++;//Para que se muestren los numeros por encima del 0 hasta el numero introducido R
		        	
		        } 
		    	
		    } 

		    System.out.println("Hay " + numreales + " numero/s mayores o iguales a " + numR  
		    		+ " hasta llegar a 1.0");
			
	
		    
		    // EJERECICO 9

			int nums100 [] = new int [100]; 
			for (int i = 0; i < nums100.length ; i++)
				
			{
				
				nums100[i] = (int)(1 + Math.random()*10);
				
			}
			
			int valorN;
			int contador1 = 0;
			
			System.out.println("Introduce el valor de N .");
			valorN = entrada.nextInt();
			
			for (int i = 0; i < nums100.length ; i++) 
				
			{
				if(nums100[i] == valorN) 
					
				{
					contador1++;
					System.out.println("Las posiciones de N = " + valorN + " son la " + i +  "º");
					
				}
				
			}
			
			if (contador1 == 0) 
				
			{
			
				System.out.println("No hay posiciones que contengan ese valor.");
				
			}

	

			//EJERCICIO 10
			
			int numalturas;
			
			System.out.println("Numero de alturas introducidas");
			numalturas = entrada.nextInt();
			
			double alturamax = Integer.MIN_VALUE;
			double alturamin = Integer.MAX_VALUE;
			double sumh = 0;
			
			double alturas [] = new double [numalturas];
			
			for (int i = 0; i < alturas.length; i++)
			
			{
				
				double primerh;
				
				System.out.println("Ingresa una altura en metros");
				primerh = entrada.nextDouble();
				
				if (primerh <= 0)
				
				{
					
					System.out.println("La altura ingresada no es válida");
					
				}
				
				alturas[i] = primerh;
				
			}
			
			for (int i = 0; i < alturas.length ; i++) 
			
			{
				
				if (alturas[i] > alturamax) 
				
				{
					
					alturamax = alturas[i];	
					
				}
				
				if (alturas[i] < alturamin) 
				
				{
					
					alturamin = alturas[i];	
					
				}
				
				sumh = sumh + alturas[i];
				
			}
				
			
			System.out.println("La altura maxima es  " + alturamax + ", la altura minima es "
			+ alturamin + " y la media de alturas es " + (sumh/alturas.length) + "." );	
			
			
			
			//EJERCICIO 11
			
			
			int nument[] =new int[100];
			int nument2[] =new int[100]; 
			
			System.out.println ("El primer array es "); 
			
			for(int i=0; i < nument.length; i++) 
			
			{
				
				nument[i] = i+1;
				System.out.println (nument[i]);
				
			}
			
			System.out.println ("El segundo array es ");
			
			for(int i=0; i <nument2.length; i++) 
			
			{
				
				nument2[i] = nument[99 - i];
				System.out.println (nument2[i]);
				
			}

			
			
			
			//EJERCICIO 14
			
			
			int numerosrep[] = new int[100];
			int valorinicial = 1; 
			       
		
			for (int i = 0; i < 100; i++)//primer for para indicar que la cantidad de numeros va a ser 100

        	{
        	
				for (int j = 0; j <= i/10; j++)//para indicar que los numeros tienen que ser 1,2 2,3 3 3... hasta llegar a 10
        		
				{
			               
					if (i < 100) 
        		
					{
			                   
        			numerosrep[i] = valorinicial;
        			i++;
			               
					}
			           
				}

        	valorinicial++;
			       
        	}
			        
			
			for (int i = 0; i < 100; i++) 
			       
			{
			   
				System.out.print(numerosrep[i] + " ");
				if ((i+1) % 10 == 0) 
			
				{
			                
				System.out.println();
				
				}
			       
			}
			
			
			
			
		
		
		
	}//cuerpo del ejerdda

}
