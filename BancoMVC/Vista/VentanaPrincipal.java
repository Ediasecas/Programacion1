package Vista;

import java.util.Scanner;


import Modelo.Cuenta;
import Modelo.CuentasVarias;

public class VentanaPrincipal {


		public static void main(String[] args)
		{
			try (Scanner entrada = new Scanner(System.in)) {
				System.out.println("__ Banco Santander __ ");
				
				CuentasVarias banco = new CuentasVarias();
				
				System.out.println("Selecciona la opcion que quieras del menu escogiendo por su numero (1-6)");
				
     
				boolean salir = false;
				int seleccionar;
				
				
				do 
				{
					
					System.out.println("1.Crear Cuenta");
					System.out.println("2.Leer datos de cuenta");
					System.out.println("3.Actualizar");
					System.out.println("4.Borrar Cuenta");
					System.out.println("5.Guardar datos de cuenta");
					System.out.println("6.Salir");
				
					System.out.println("Seleccione una opcion escogiendola por su num 1-8");
					seleccionar = entrada.nextInt();
					
				
					switch(seleccionar)
					
					{
					
						
						case 1:	
							
							entrada.nextLine();
							
							System.out.println("Introduzca el codigo identiificativo de la cuenta");
							String codigo = entrada.nextLine();
							
							System.out.println("Introduzca el nombre del titular de la cuenta");
							String nombT = entrada.nextLine();
							
							System.out.println("Introduzca el IBAN de la cuenta");
							String IBAN = entrada.nextLine();
							
							System.out.println("Introduzca el saldo actual de la cuenta");
							double saldoA = entrada.nextInt();
							
							Cuenta nuevaCuenta = new Cuenta (codigo, nombT, IBAN, saldoA);
							banco.anadirCuenta(nuevaCuenta);
							
							
						break;
						
						
						case 2:
							
							entrada.nextLine();
							System.out.println("Introduzca el codigo identiificativo de la cuenta que desea leer sus datos");
							String codigoL = entrada.nextLine();
							
							banco.buscarCuenta(codigoL);
							
							
						break;
						
						
						case 3:
					
							entrada.nextLine();
							System.out.println("Introduzca el codigo identiificativo de la cuenta que desea actualizar sus datos");
							String codigoA = entrada.nextLine();
							
							
							
						break;	
						
						
						case 4:
							
							entrada.nextLine();
							System.out.println("Introduzca el codigo identiificativo de la cuenta que desea borrar");
							String codigoB = entrada.nextLine();
							
						break;
						
						
						case 5:
							
							entrada.nextLine();
							System.out.println("Introduzca el codigo identiificativo de la cuenta que desea guardar en un archivo .dat");
							String codigoG = entrada.nextLine();
						    
						break;

						
						case 6:
						   
							 System.out.println("Usted salio del programa correctamente");
			                 salir = true;
						    
						break;
							
					
							
					
							
					}//llave del switch
				
				
				}while(!salir);
			}
			
			
		

	}//main

}


