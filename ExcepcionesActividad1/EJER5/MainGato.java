package EJER5;

import java.util.Scanner;

public class MainGato {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		try {
            
            Gato gato1 = new Gato("Tom", 5);
            Gato gato2 = new Gato("Bigotes", 2);
            Gato gato3 = new Gato("Tiger", 1);
            Gato gato4 = new Gato("Rex", 2);
           
            
            System.out.println("Introduce un nuevo nombre para el gato1:");
            String nuevoNombre1 = entrada.nextLine();
            gato1.setNombre(nuevoNombre1);

            System.out.println("Introduce una nueva edad para el gato1:");
            int nuevaEdad3 = entrada.nextInt();
            gato1.setEdad(nuevaEdad3);
            
            System.out.println("Datos del gato 1:");
            gato1.imprimirDatosGato();

            Gato gato5 = new Gato("Me", -1);//Excepcion debido a que el nombre y la edad no cumplen con las validaciones correctas
            
            
            
        } 
		
		catch (GatoException e)
		{
            System.out.println("Se produjo una excepción debido a que el nombre del gato tiene que tener mas de 3 letras y/o la edad no puede ser negativa");
        }
	}

}
