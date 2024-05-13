package Modelo;

import java.util.LinkedList;
import java.util.List;

public class CuentasVarias 
{
	private List<Cuenta> cuentasBancarias = new LinkedList<>();

	
	public void anadirCuenta(Cuenta nueva)
	{
		this.cuentasBancarias.add(nueva);
	}
		
	
	public void buscarCuenta(String codigo)
	{
		for(Cuenta cuenta : cuentasBancarias)
		{
			if(cuenta.getCod().equals(codigo))
			{
				System.out.println(cuenta);
			}
		}
	}
	
	
	public void eliminarCuenta(String codigo)
	{
		for(Cuenta cuenta : cuentasBancarias)
		{
			if(cuenta.getCod().equals(codigo))
			{
				cuentasBancarias.remove(cuenta);
			}
		}
	}
	
	
	public void guardaraCuenta(String codigo)
	{
		for(Cuenta cuenta : cuentasBancarias)
		{
			if(cuenta.getCod().equals(codigo))
			{
				cuentasBancarias.remove(cuenta);
			}
		}
	}
	
	
	
}