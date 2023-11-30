package dawBank;
import java.util.Scanner;
import java.util.Set;

public class Main

{

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);

		System.out.println("__ Banco Santander __ ");
		
		
		System.out.println("Inserte el IBAN en su formato correcto");
		String IBAN = entrada.nextLine();
		
			

		System.out.println("Inserte el titular de la cuenta en su formato correcto");
		String titular = entrada.nextLine();
		
		
		CuentaBancaria cuenta = new CuentaBancaria(IBAN, titular);
		
		
		if(cuenta.validacionIBAN() == true)
		{
			System.out.println("Se ha introducido el IBAN correctamente");
		}
		
		else
		{
			System.out.println("No se introdujo el IBAN correctamente");
		}
		
		
		if(cuenta.validacionTitular() == true)
		{
			System.out.println("Se ha introducido el titular correctamente");
		}
		
		else
		{
			System.out.println("No se introdujo el titular correctamente");
		}
		
		
		
		boolean salir = false;
		int seleccionar;
		
		
		do 
		{
			
			System.out.println("1.Datos de la cuenta");
			System.out.println("2.IBAN");
			System.out.println("3.Titular");
			System.out.println("4.Saldo");
			System.out.println("5.Ingreso");
			System.out.println("6.Retirada");
			System.out.println("7.Movimientos");
			System.out.println("8.Salir");
		
			System.out.println("Seleccione una opcion escogiendola por su num 1-8");
			seleccionar = entrada.nextInt();
			
			double ingreso;
			double retirada;
			
			switch(seleccionar)
			
			{
			
				
				case 1:	
					
					System.out.println("Los datos de la cuenta son :");
					System.out.println("Su IBAN es " + cuenta.getIBAN() );
					System.out.println("El nombre del titular es  " + cuenta.getTitular());
					System.out.println("Su saldo actual es " + cuenta.getSaldo());
			
				break;
				
				
				case 2:
					
					System.out.println("Su IBAN es " + cuenta.getIBAN() );
					
				break;
				
				
				case 3:
			
					System.out.println("El nombre del titular es  " + cuenta.getTitular());
					
				break;	
				
				
				case 4:
					
					System.out.println("Su saldo actual es " + cuenta.getSaldo());
					
				break;
				
				
				case 5:
					
					System.out.println("Introduzca la cantidad a ingresar");
					ingreso = entrada.nextDouble();
					
					System.out.println("Usted ha ingresado la cantidad de " + ingreso);
					
				break;	
				
				
				case 6:
					
					System.out.println("Introduzca la cantidad a retirar");
					retirada = entrada.nextDouble();
					
					System.out.println("Usted ha retirado la cantidad de " + retirada);
					
				break;	
					
				
				case 7:
					
					System.out.println("Movimientos " + cuenta.mostrarMovimientos());
					
				break;	
					
				
				case 8:
					
					System.out.println("Usted salió del programa correctamente");
					salir = true;
					
				break;	
					
			
					
			}//llave del switch
		
		
		}//llave del do
		while(!salir);
		
		
	

	}//main

}
