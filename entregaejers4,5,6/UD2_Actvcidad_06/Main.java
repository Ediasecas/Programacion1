import java.util.Scanner;
public class Main {
	
	
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		//EJERCICIO1
		
        int matriz[][]=new int[5][5]; //Para crear la matriz de 5x5
        
        for(int i=0; i<matriz.length; i++)//primer for para recorrer filas
       
        {
            
        	for(int j=0;j<matriz[0].length;j++)// segundo for para recorrer colum
            
            {
               
        		matriz[i][j]=(i*matriz.length)+(j+1);
                System.out.print(matriz[i][j]+" ");// se pone systemos.out.print para escribir la primera colum  1 2 3 4 5 
                 
            }
        	
            System.out.println("");//para hacer saltos de fila
            
        }	

        
        
        //EJERCICO 2

        String tablasmult[][]=new String[10][10];//"ARRAY" 10 FILAS 10 COLUM
        
        for(int i=0; i<tablasmult.length; i++)//PRIMER FOR PARA RECORRER FILAS
        	
        {
        	
               for(int j=0;j<tablasmult.length;j++)//PRIMER FOR PARA RECORRER COLUMNAS
               
               {
            	   
                   int multiplic = (i+1) * (j+1);
                  
                   tablasmult[i][j]= String.valueOf(multiplic);//String.valueOf(i)+ " x "+ String.valueOf(j) + " = " + mul;

                   System.out.print(tablasmult[i][j]);
                   System.out.print("  ");
                   
               }
               
               System.out.println("  ");
               
        }


        
        //EJERCICIO 3
       
        System.out.println ("Introduce un numero de filas N");//ponemos de ejemplo 2 filas
        int num_n = entrada.nextInt();
        
        
        System.out.println ("Introduce un numero de columnas  M");//ejemplo 2 columnas
        int num_m = entrada.nextInt();
        
        int matriz2 [][] = new int[num_n][num_m];
        
        int num_mayor0 = 0;
        int num_menor0 = 0;
        int num_igual0 = 0;
        
        for (int i = 0 ; i < num_n ; i++) 
        
        {
            
        	for (int j = 0 ; j < num_m ; j++) 
            
        	{
               
        		System.out.print("Introduce el valor para la posición (" + (i + 1) + "," + (j + 1) + "): "); //peedimod que nos den los valores en la posicion (1,1),(1,2);(2,1),(2,2) para ello recorre i(fila)+1 y cuando acabe las 2 column(en este caso) ira a la 2 fila
                matriz2[i][j] = entrada.nextInt();
                    
            }
        	
        }

        
        for (int i = 0 ; i < num_n ; i++) 
        
        {
             
        	for (int j = 0 ; j < num_m ; j++) 
        
        	{
        		int valores = matriz2[i][j];
        		
        		if (valores > 0) 
        	
        		{
        		
        			num_mayor0++;
        		
        		} 
        	
        		else if (valores < 0)
        		
        		{
        	                
        			num_menor0++;
        			
        		} 
        	                 
        		else 
        	
        		{
        	                 
        			num_igual0++;
        		
        		}
        	          
        	
        	}
        	       
		}
        
        System.out.println("La cantidad de valores mayores que cero es/son " + num_mayor0);
        System.out.println("La cantidad de valores menores que cero es/son " + num_menor0);
        System.out.println("La cantidad de valores igual a cero es/son " + num_igual0);

        
        
        //EJERCICIO 4 
        
        System.out.println("Hay 4 alumnos nombrados con nº del 1-4 y 5 asignaturas nombradas del 1-5");
        
        int num_Alumn = 4;
        int num_Asign = 5;

      
        int[][] notas = new int[num_Alumn][num_Asign];//hacemos un "array entre alumnos (filas) y asign(columnas)

        for (int i = 0; i < num_Alumn; i++)//filas
        	
        {
        	
            for (int j = 0; j < num_Asign; j++) //columnas
            	
            {
          
                System.out.print("Introduce la nota del Alumno " + (i + 1) + " en la Asignatura " + (j + 1) + ": ");//para introducir x notas en x asignaturas y se guarden
                notas[i][j] = entrada.nextInt();
                
            }
            
        }

        
        for (int i = 0; i < num_Alumn; i++) //Recorremos con el for los alumnos(filas)
        	
        {
        	
            int nota_min = notas[i][0];//nota min alumno
            int nota_max = notas[i][0];//notamax alumn
            int nota_total = 0;

            for (int j = 0; j < num_Asign; j++)//Recorremos con el for las asignaturas (columnas)
            
            {
            	
                int nota = notas[i][j];//para poder obtener la nota deseada recorriendo la matriz entera;fila y column
                
                if (nota < nota_min) 
                	
                {
                	
                	nota_min = nota;
                    
                }
                
                  
               

                   
                if (nota > nota_max)
                
                {
                	
                	nota_max = nota;
                    
                }
                
                nota_total += nota;
                
            }

                          
          double nota_media = (double) nota_total / num_Asign;

            System.out.println("El alumno  " + (i + 1) + " tiene estas notas ");
            
            System.out.println("La nota mínima es " + nota_min);
           
            System.out.println("La nota máxima es " + nota_max);
            
            System.out.println("La nota media es " + nota_media);
            
            System.out.println();
            
        }
        	                   
        
	}//MAIN

}//ACTIVIDAD 6
