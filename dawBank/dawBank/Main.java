package dawBank;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main

{

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);

		System.out.println("__ Banco Santander __ ");
		
		System.out.println("Introduzca sus datos");
		CuentaBancaria cuenta = new CuentaBancaria("","");
		
		System.out.println("Inserte el IBAN en su formato correcto");
        String IBAN = entrada.nextLine();
        Pattern formato = Pattern.compile("[A-Z]{2}[0-9]{22}");
        formato.matcher(IBAN);
        Matcher mat = formato.matcher(IBAN);
		
		while(!mat.matches())
			{
		        	 
		     System.out.println("IBAN no válido. Introduzcalo de nuevo:");
		     IBAN = entrada.nextLine();
		     mat = formato.matcher(IBAN);
		           
		    }
		 
         
        System.out.println("Inserte el titular de la cuenta en su formato correcto");
 		String titular = entrada.nextLine();
		    

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
					System.out.println("Su IBAN es: " + cuenta.getIBAN() );
					System.out.println("El nombre del titular es:  " + cuenta.getTitular());
					System.out.println("Su saldo actual es: " + cuenta.getSaldo());
			
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
