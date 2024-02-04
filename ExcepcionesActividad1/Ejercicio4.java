import java.util.Scanner;

public class Ejercicio4
{

	public static void main(String[] args)
	
	{
		Scanner entrada = new Scanner(System.in);
		int numP;
		
		System.out.println("Introduce un numero");
		numP = entrada.nextInt();
		
		
			
	}//MAIN
	
	public void imprimePositivo(int numP)
	{
		if(numP > 0)
		{
			System.out.println(numP);
		}
		else
		{
			throw new NumeroNegativo;
		}
	}
	
	
}//EJERCICIO 4
