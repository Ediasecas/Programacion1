package EJER4;

import java.util.Scanner;

public class Ejercicio4
{

	public static void main(String[] args)
	
	{
		Scanner entrada = new Scanner(System.in);
		int num;

		try
		{
<<<<<<< HEAD
			
=======
>>>>>>> 5a4d6068dbd530deba928a38c85bf10504f001c4
				System.out.println("Introduce un numero");
				num = entrada.nextInt();
		
				imprimePositivo(num);
				imprimeNegativo(num);
		}
		
		
		catch(NumeroNegativoException e)
		{
			System.out.println("Se produjo una excepcion debido a que no se introdujo un numero positivo correcto");
			
		}
		
		catch(NumeroPositivoException e)
		{
			System.out.println("Se produjo una excepcion porque no se introdujo un numero negativo correcto");
			
		}
			
	}//MAIN
	
	
	
	public  static void imprimePositivo(int numero) throws NumeroNegativoException //al estar en la clase main,que es static, dicho metodo tendra que ser static tmb
	{
		if(numero > 0)
		{
			System.out.println("El numero introducido es " + numero);
		}
		else
		{
			throw new NumeroNegativoException(numero);
		}
	}
	
	
	
	
	public static void imprimeNegativo(int numero) throws NumeroPositivoException
	{
		if(numero <= 0)
		{
			System.out.println("El numero introducido es " + numero);
		}
		else
		{
			throw new NumeroPositivoException(numero);
		}
	}
	
	
	
	
}//EJERCICIO 4
