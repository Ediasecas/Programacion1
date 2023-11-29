package dawBank;
import java.util.Scanner;
import java.util.Set;

public class Main
{

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);

		System.out.println("Inserte el IBAN en su formato correcto");
		String IBAN = entrada.nextLine();

		System.out.println("Inserte el titular de la cuenta en su formato correcto");
		String titular = entrada.nextLine();
		
		
		
		CuentaBancaria cuenta = new CuentaBancaria(IBAN, titular);
		
		System.out.println(" Banco Santander ");
	
		
		boolean salir = false;
		int seleccionar;
		
		boolean validacionIBAN = true;
		boolean validacionTitular = true;
		
		
		
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
		
		
		switch(seleccionar)
		{
		
			case 1:	
				
				System.out.println("Los datos de la cuenta son :");
				System.out.println("Su IBAN es " );
				System.out.println("El nombre del titular es  " + titular);
				System.out.println("Su saldo es 0.0€");
		
			break;
			
			case 2:
				
		
		}
		
		
		}
		
		while(!salir);
		
		
		// TODO Auto-generated method stub

	}

}
