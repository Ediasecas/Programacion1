package Vista;

import java.util.Scanner;

import Controlador.CuentasVarias;
import Modelo.Cuenta;

public class VentanaPrincipal {

		
		public static void main(String[] args)
		{
			Scanner entrada = new Scanner(System.in);
			System.out.println("__ Banco Santander __ ");
				
			CuentasVarias banco = new CuentasVarias();
				
				
     
			boolean salir = false;
			int seleccionar = 0;
				
				do 
				{
					
			        System.out.println("1. Crear Cuenta");
			        System.out.println("2. Leer datos de Cuenta");
			        System.out.println("3. Actualizar datos de Cuenta");
			        System.out.println("4. Borrar Cuenta");
			        System.out.println("5. Guardar datos de Cuenta");
			        System.out.println("6. Salir");
			        System.out.println("Selceccione una opcion del menu escogiendola por su numero");
			        
			       
			        seleccionar = entrada.nextInt();
					switch(seleccionar)
					
					{
					
						case 1:				
						        
							System.out.println("Introduzca el codigo idntificativo de la cuenta ");
							String cod = entrada.next();
							     
							    
							entrada.nextLine();
							System.out.println("Introduzca el nombre del titular la cuenta");	    
							String nombreCuenta = entrada.nextLine();

							       
							
							System.out.println("Introduzca el numero de cuenta");
							String numCuenta = entrada.nextLine();
							
							Cuenta nuevaCuenta = new Cuenta(cod, nombreCuenta, numCuenta, 0);
							
							banco.CrearCuenta(nuevaCuenta);
							
						break;
						
						
						case 2:
							entrada.nextLine();
							
							System.out.println("Introduzca el codigo identificativo de la cuenta que desea leer sus datos");
							String codigoL = entrada.nextLine();
							entrada.nextLine();
							
							banco.leerCuenta(codigoL);
							
							
						break;
						
						
						case 3:
							entrada.nextLine();
							
							System.out.println("Introduzca el código identificativo de la cuenta que desea actualizar:");
			                String codigoA = entrada.nextLine();
			                
			                System.out.println("Introduzca el nuevo nombre del titular de la cuenta:");
			                String nuevoNombre = entrada.nextLine();
			                
			                System.out.println("Introduzca el nuevo número de cuenta:");
			                String nuevoNumero = entrada.nextLine();
			                
			                System.out.println("Introduzca el nuevo saldo de la cuenta:");
		                    double nuevoSaldo = entrada.nextDouble();
		                    
		                    entrada.nextLine();
		                    
			                banco.actualizarCuenta(codigoA, nuevoNombre, nuevoNumero, nuevoSaldo);
			                    
	
						break;	
						
						
						case 4:
							entrada.nextLine();
							
							System.out.println("Introduzca el codigo identiificativo de la cuenta que desea borrar");
							String codigoB = entrada.nextLine();
							entrada.nextLine();
							
							banco.eliminarCuenta(codigoB);
						break;
						
						
						case 5:
							
							 banco.guardarCuenta(); 
			                
						break;

						
						case 6:
						   
							 System.out.println("Usted salio del programa correctamente");
			                 salir = true;
						    
						break;
							
					
							
					
							
					}//llave del switch
				
				
				}while(!salir);
				
				entrada.close();
			}
			
			
		

	}//main




