
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main

{
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);

		System.out.println("__ Banco Santander __ ");
		
		
		
		 // REGISTRO DE CLIENTES
        System.out.println("Registro de clientes:");
        
        
        
        System.out.println("Introduzca el nombre del cliente");//FORMATO NOMBRE CLIENTE
        String nombreCliente  = entrada.nextLine();

        Pattern pat1 = Pattern.compile("^([A-Za-zÑñÁáÉéÍíÓóÚú]+['\\-]{0,1}[A-Za-zÑñÁáÉéÍíÓóÚú]+)(\\s+([A-Za-zÑñÁáÉéÍíÓóÚú]+['\\-]{0,1}[A-Za-zÑñÁáÉéÍíÓóÚú]+))*$");
        pat1.matcher(nombreCliente);
        Matcher mat1 = pat1.matcher(nombreCliente);
        while(!mat1.matches())
        {
            System.out.println("Nombre no válida. Introduzcalo de nuevo: (EJEMPLO --> Edgar Nuñez ");
            nombreCliente = entrada.next();
            mat1 = pat1.matcher(nombreCliente);
        }
//-------------------------------------------------------------------------------------------------------
		

        System.out.println("Ingrese el DNI del cliente:");//DNI FORMATO
        String DNI = entrada.nextLine();
        
    	Pattern pat2 = Pattern.compile ("^[0-9]{8}[A-Z]{1}");
    	pat2.matcher(DNI);
		Matcher mat2 = pat2.matcher(DNI);
		while(!mat2.matches())
		{	 
	     System.out.println("DNI no válido. Introduzcalo de nuevo: (EJEMPLO --> 72178507E) ");
	     DNI = entrada.nextLine();
	     mat2 = pat2.matcher(DNI);    
	    }
//---------------------------------------------------------------------------------------------------------
		
        System.out.println("Ingrese la fecha de nacimiento del cliente (YYYY-MM-DD):");//fecha de nacimiento
        LocalDate fechaNacimiento = LocalDate.parse(entrada.nextLine());
//---------------------------------------------------------------------------------------------------
        
        System.out.println("Ingrese el número de teléfono del cliente:");//FORMATO NUM TLFN
        String numeroTelefono = entrada.nextLine();
        
    	Pattern pat3 = Pattern.compile ("^[6,7,9][0-9]{8}");
    	pat3.matcher(DNI);
		Matcher mat3 = pat3.matcher(numeroTelefono);
		while(!mat3.matches())
		{       	 
	     System.out.println("Numero de telefono no válido. Introduzcalo de nuevo: (EJEMPLO --> 658129122) ");
	     numeroTelefono = entrada.nextLine();
	     mat3 = pat3.matcher(numeroTelefono);           
	    }
//-----------------------------------------------------------------------------------------
		
        System.out.println("Ingrese el email del cliente:");
        String email = entrada.nextLine();
//---------------------------------------------------------------------------------------
        
        System.out.println("Ingrese la dirección del cliente:");
        String direccion = entrada.nextLine();

        
        
        Cliente cliente = new Cliente(nombreCliente, DNI, fechaNacimiento, numeroTelefono, email, direccion);//CREACION DE CLIENTE
//----------------------------------------------------------------------------------------    
        
        
        // REGISTRO DE CUENTA BANCARIA ASOCIADA A CLIENTES
        
        System.out.println("Creación de cuenta bancaria:");
        
        System.out.println("Ingrese el IBAN de la cuenta bancaria:");//FORMATO IBAN
        String IBAN = entrada.nextLine();
        
        Pattern pat4 = Pattern.compile("[A-Z]{2}[0-9]{22}");
        pat4.matcher(IBAN);
        Matcher mat4 = pat4.matcher(IBAN);
        while(!mat4.matches())
        {
            System.out.println("IBAN no válido. Introduzcalo de nuevo: (EJEMPLO --> ES1234567891234567890000)");
            IBAN = entrada.next();
            mat4 = pat4.matcher(IBAN);
        }
        
        CuentaBancaria cuenta = new CuentaBancaria(IBAN, cliente); //CREACION DE CUENTA
        

		boolean salir = false;
		int seleccionar;
		double ingresoDinero;
		double retiradaDinero;
		
		do 
		{
			
			System.out.println("1.Datos de la cuenta");
			System.out.println("2.IBAN");
			System.out.println("3.Nombre del Cliente");
			System.out.println("4.Saldo");
			System.out.println("5.Ingreso");
			System.out.println("6.Retirada");
			System.out.println("7.Movimientos");
			System.out.println("8.Datos del Cliente");
			System.out.println("9.Salir");
		
			System.out.println("Seleccione una opcion escogiendola por su num 1-8");
			seleccionar = entrada.nextInt();
			
		
			switch(seleccionar)
			
			{
			
				
				case 1:	
					
					System.out.println("Los datos de la cuenta son :");
					 cuenta.mostrarDatosCuenta();
			
				break;
				
				
				case 2:
					
					System.out.println("Su IBAN es " + cuenta.getIBAN() );
					
				break;
				
				
				case 3:
			
					System.out.println("El nombre del cliente es  " + cuenta.getCliente().getNombre());
					
				break;	
				
				
				case 4:
					
					System.out.println("Su saldo actual es " + cuenta.getSaldo());
					
				break;
				
				
				case 5:
				    System.out.println("Introduzca la cantidad a ingresar");
				    ingresoDinero = entrada.nextDouble();
				    try
				    {
				        cuenta.ingreso(ingresoDinero);
				        System.out.println("Se realizó el ingreso correctamente.");
				    } 
				    catch (CuentaException e)
				    {
				        System.out.println("Error al realizar el ingreso: " + e.getMessage());
				    }
				    
				break;

				case 6:
				    System.out.println("Introduzca la cantidad a retirar");
				    retiradaDinero = entrada.nextDouble();
				    try 
				    {
				        cuenta.retirada(retiradaDinero);
				        System.out.println("Se realizó la retirada correctamente.");
				    }
				    catch (CuentaException e) 
				    
				    {
				        System.out.println("Error al realizar la retirada: " + e.getMessage());
				    }
				    
				    
				break;
					
				
				case 7:
					
					System.out.println("Los movimientos son ");
					cuenta.mostrarMovimientos();
					
				break;	
					
				case 8:
					
					System.out.println("Datos del cliente:");
				    cliente.mostrarDatosCliente();
				    break;
				    
					
				case 9:
					
					System.out.println("Usted salió del programa correctamente");
					salir = true;
					
				break;	
					
			
					
			}//llave del switch
		
		
		}//llave del do
		while(!salir);
		
		
	

	}//main
	
	//preguntar asociar cliente a cuentabancaria
	
}




