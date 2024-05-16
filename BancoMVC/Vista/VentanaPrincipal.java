package Vista;

import java.util.Scanner;
import java.util.regex.Pattern;

import Controlador.CuentasVarias;
import Modelo.Cuenta;

public class VentanaPrincipal {

		
		public static void main(String[] args)
		{
			Scanner entrada = new Scanner(System.in);
			System.out.println("__ Banco Santander __ ");
				
			CuentasVarias banco = new CuentasVarias();//Creacion del banco para poder trabajar sobre él.
				

			boolean salir = false; //Inicializamos la variable salir = false para el case 6
			int seleccionar = 0;//creacion de la variable para "seleccionar" para poder escoger una opcion del menu.
				
				do 
				{
					//menu de opciones de nuestro banco
					
			        System.out.println("1. Crear Cuenta");
			        System.out.println("2. Leer datos de Cuenta");
			        System.out.println("3. Actualizar datos de Cuenta");
			        System.out.println("4. Borrar Cuenta");
			        System.out.println("5. Guardar datos de Cuenta");
			        System.out.println("6. Salir");
			        System.out.println("Selceccione una opción del menu escogiendola por su número");
			        
			       
			        seleccionar = entrada.nextInt();
					switch(seleccionar)//switch para intercalar entre opciones escogidas por su numero
					
					{
					
						case 1:			//Creacion de la cuenta	
							entrada.nextLine();
							
						    System.out.println("Introduzca el código identificativo de la cuenta (Formato: BANK_XXX):");
			                String cod = "";
			                boolean codigoValido = false;

			                while (!codigoValido)
			                {
			                 cod = entrada.nextLine();
			                  if (Pattern.matches("BANK_\\d{3}", cod)) 
			                  {
			              	  codigoValido = true;
			                  } 
			                  else 
			                  {
			                	  System.out.println("Formato incorrecto. Introduzca un código válido (BANK_XXX):");
			                  }
			                }//validador del codigo identificativo, tiene que cumplir el formato BANK_123  O BANK_000 el (varia el numero) 
			                     
							    
							
			                System.out.println("Introduzca el nombre del titular la cuenta:");//Solicitud del nombre del titular de la cuenta sin formato.  
			                String nombreCuenta = entrada.nextLine();

							       
			                System.out.println("Introduzca el numero de cuenta (Ejemplo: 1234 1234 XX 1234567890):");
			                String numCuenta;

			                while (true) 
			                {
			                	numCuenta = entrada.nextLine();
			                	if (Pattern.matches("\\d{4} \\d{4} [A-Z]{2} \\d{10}", numCuenta)) 
			                	{
			                		break; 
			                	} 
			                	else 
			                	{
			                		System.out.println("Formato incorrecto. Introduzca un número de cuenta válido (Ejemplo: 1234 1234 XX 1234567890):");
			                	}
			                }//validador del numero de cuenta, tiene que cumplir el formato 1234 1234 EE 1234567890  (Pueden variar tanto nums como letras XX pero cumpliendo con el formato de los espacios y length) 
							
			                Cuenta nuevaCuenta = new Cuenta(cod, nombreCuenta, numCuenta, 0);//Creacion de la cuenta (creacion del objeto) pasandole los datos pedidos anteriormente, al crear cuenta pondremos el saldo como 0 ya que es una cuenta nueva
							
			                banco.crearCuenta(nuevaCuenta);//Pasamos a nuestro banco el metodo crear cuenta para pasarle nuestro nueva cuenta y que quede guardada
							
						break;
						
						
						case 2:
							entrada.nextLine(); 
							
							System.out.println("Introduzca el código identificativo de la cuenta que desea leer sus datos (Formato: BANK_XXX):");
							String codigoL = entrada.nextLine();//Pedimos el codigo de la cuenta que deseemos leer sus datos, el codigo cumplira con el mismo formato ya que esta pedido y guardado al crear cuenta.
							
							banco.leerCuenta(codigoL);//Llamamos al metodo leerCuenta de la cuenta con el codigo pedido anteriormente (codigoL)
							
						break;
						
						
						case 3:
							entrada.nextLine();
							
							System.out.println("Introduzca el código identificativo de la cuenta que desea actualizar (Formato: BANK_XXX):");//Pedimos el codigo de la cuenta que deseemos actualizar, el codigo cumplira con el mismo formato ya que esta pedido y guardado al crear cuenta.
			                String codigoA = entrada.nextLine();
			                
			                System.out.println("Introduzca el nuevo nombre del titular de la cuenta:");//Pedimos otra vez los datos de la cuenta, en este caso el nombre del titular de la cuenta.
			                String nuevoNombre = entrada.nextLine();
			                
			                System.out.println("Introduzca el nuevo número de cuenta (Ejemplo: 1234 1234 XX 1234567890)");/*Pedimos el numero de cuenta, en este caso
			                																								tendremos que pedir el formato otra vez ya que 
			                																								no es como el codigo identificativo que es 
			                																								el mimso para todos, ya que al actualizar los datos podría cambiar el formato*/
			                String nuevoNumero = entrada.nextLine();
			                
			                while (true) 
		                    {
		                        nuevoNumero = entrada.nextLine();
		                        if (Pattern.matches("\\d{4} \\d{4} [A-Z]{2} \\d{10}", nuevoNumero)) 
		                        {
		                            break; 
		                        } 
		                        else 
		                        {
		                            System.out.println("Formato incorrecto. Introduzca un numero de cuenta válido (Ejemplo: 1234 1234 XX 1234567890):");
		                        }
		                    }//Patern del formato
			                
			                System.out.println("Introduzca el nuevo saldo de la cuenta:");
		                    double nuevoSaldo = entrada.nextDouble();//Al actualizar los datos de cuenta pedirá tambien el saldo .
		                                    
			                banco.actualizarCuenta(codigoA, nuevoNombre, nuevoNumero, nuevoSaldo);//Llamamos al metodo actualizarCuenta y pasamos los nuevos datos introducidos.
			                    
	
						break;	
						
						
						case 4:
							entrada.nextLine();
							
							System.out.println("Introduzca el codigo identificativo de la cuenta que desea borrar (Formato: BANK_XXX)");//Pedimos el cod para poder eliminar cuenta.
							String codigoB = entrada.nextLine();
					
							banco.eliminarCuenta(codigoB);//Llamamos al metodo eliminarCuenta de la cuenta con el codigo pedido anteriormente (codigoB).
						break;
						
						
						case 5:
							
							 banco.guardarCuenta();/*Guardamos todas las cuentas, aunque borremos una cuenta y abramos el archivo cuenta.dat si
							 no le damos a guardar cuenta no se actualizar los datos en cuenta.dat*/
			                
						break;

						
						case 6:
						   
							 System.out.println("Usted salio del programa correctamente");
			                 salir = true;//Declaramos salir = true para poder salir del menu.
						    
						break;
							
					
							
					
							
					}//llave del Switch.
				
				
				}while(!salir);
				
				entrada.close();
			}
			
			
		

	}//main




