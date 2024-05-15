package Controlador;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Modelo.Cuenta;

public class CuentasVarias
{
    

	private List<Cuenta> cuentasBancarias = new LinkedList<>();

	/*	private String cod;
	private String nombreCuenta;
	private String numCuenta;
	private double saldo; */
	
	
	
	
	public void CrearCuenta(Cuenta c)
	{
			
		cuentasBancarias.add(c); 
	    System.out.println("Cuenta registrada con éxito.");

	}
	
	
 
	public void leerCuenta(String codigo)
	{
		
		
			
			for(Cuenta cuenta : cuentasBancarias)
			{
				if(cuenta.getCod().equals(codigo))
				{
					System.out.println(cuenta.toString());
				}
				else
				{
					System.out.println("No se encontró el codigo de esa cuenta");
				}
			}
			
			if(cuentasBancarias.size() == 0)
			{
				System.out.println("No hay cuentas");
			}
	}
	
		
	
	public void eliminarCuenta(String codigo)
	{
		
		for(Cuenta cuenta : cuentasBancarias)
		{
			if(cuenta.getCod().equals(codigo))
			{
				cuentasBancarias.remove(cuenta);
				System.out.println("La cuenta con codigo " + codigo + " se ha eliminado correctamente");
			}
			else
			{
				System.out.println("No se encontró una cuenta con ese codigo");
			}
		}
		
		if(cuentasBancarias.size() == 0)
		{
			System.out.println("No hay cuentas");
		}

	}
	
	
	public void guardarCuenta(String codigo)
	{
		for(Cuenta cuenta : cuentasBancarias)
		{
			if(cuenta.getCod().equals(codigo))
			{
				
			}
		}
	}
	
	
	
}
