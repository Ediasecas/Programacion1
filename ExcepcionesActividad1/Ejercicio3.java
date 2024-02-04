import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		double vector [] = new double[5];
		double num1,num2,num3,num4,num5;
		try 
		{
			
				System.out.println("Introduzca el primer valor del vector");
				num1 = entrada.nextDouble();
				
				System.out.println("Introduzca el segundo valor del vector");
				num2 = entrada.nextDouble();
				
				System.out.println("Introduzca el tercer valor del vector");
				num3 = entrada.nextDouble();
				
				System.out.println("Introduzca el cuarto valor del vector");
				num4 = entrada.nextDouble();
				
				System.out.println("Introduzca el quinto valor del vector");
				num5 = entrada.nextDouble();
				
				vector[0] = num1;
				vector[1] = num2;
				vector[2] = num3;
				vector[3] = num4;
				vector[4] = num5;
				vector[7] = num5;
				
			
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("Ocurrió una excepcion debido que no se introdujo un numero ");
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Ocurrió una excepcion debido que no se introdujo un numero en el formato correcto double");
		}
		
		
		
	}

}
