package Controlador;


import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


import Modelo.Cuenta;

public class CuentasVarias
{
	
	final boolean modoApend = true;
    
	private List<Cuenta> cuentasBancarias = new LinkedList<>();

	
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
			System.out.println("No hay cuentas agregadas en el banco en este momento");
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
			System.out.println("No hay cuentas agregadas en el banco en este momento");
		}

	}
	
	
	public void actualizarCuenta(String codigo, String nuevoNombre, String nuevoNumero, double nuevoSaldo) 
	{
		for (Cuenta cuenta : cuentasBancarias) 
		{
			if (cuenta.getCod().equals(codigo)) 
			{
				cuenta.setNombreCuenta(nuevoNombre);
	            cuenta.setNumCuenta(nuevoNumero);
	            cuenta.setSaldo(nuevoSaldo);
	            
	            System.out.println("Los datos de la cuenta con codigo " + codigo + " se han actualizado correctamente.");
	            return; 
	        }
			else
			{
				System.out.println("No se encontro una cuenta con ese codigo");
			}
	    }
		
		if(cuentasBancarias.size() == 0)
		{
			System.out.println("No hay cuentas agregadas en el banco en este momento");
		}
	      
	 }
	
	
	public void guardarCuenta()
	{
		String filePath = "./modelo/Cuentas.dat";
		try (FileOutputStream os = new FileOutputStream(filePath);
	             DataOutputStream escritor = new DataOutputStream(os))
		{
			
			for(Cuenta c: cuentasBancarias)
			{
				escritor.writeUTF(c.getCod());
				escritor.writeUTF(c.getNombreCuenta());
				escritor.writeUTF(c.getNumCuenta());
				escritor.writeDouble(c.getSaldo());
			}
			
			System.out.println("Cuentas guardadas correctamente en el archivo " +  filePath);
		}
		
		catch(IOException e) 
		{
			System.out.println("Se ha producido un error en el manejo del fichero " +  filePath);
			System.out.println(e.getMessage());
		}
		
		finally 
		{
			System.out.println("La escritura del fichero ha finalizado.");
		}
	}
	
	
	
}
