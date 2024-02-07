package EJER6;

import java.util.ArrayList;
import java.util.Scanner;

public class MainGatoA {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);

        ArrayList<GatoArrayList> listaGatos = new ArrayList<>();

        int gatosCreados = 0;

        while (gatosCreados < 5) 
        {
            try
            {
            	String nombre;
            	int edad;
            	entrada= new Scanner(System.in);
            	
            	
                System.out.println("Introduce el nombre del gato " + (gatosCreados + 1) + ":");
                nombre = entrada.nextLine();

                System.out.println("Introduce la edad del gato " + (gatosCreados + 1) + ":");
                edad = entrada.nextInt();

                GatoArrayList nuevoGato = new GatoArrayList(nombre, edad);
                listaGatos.add(nuevoGato);

                gatosCreados++;
            }
            
            catch (GatoExceptionA e) 
            {
                System.out.println("Se produjo una excepción debido a que no se introdujo correctamente " +
                		 "el nombre del gato (3 caracteres como minimo) y/o la  (no menor de 0 años).") ;
            } 
            
         
            catch (NumberFormatException e) 
            {
                System.out.println("Se produjo una excepción debido a que no se introdujo un número válido para la edad.");
            }
        }

        
        System.out.println("Información de los gatos:");
        System.out.println("--------------------");
        
        for (GatoArrayList gato : listaGatos) 
        {
            gato.imprimirDatosGato();
            System.out.println("--------------------");
        }

	}

}
