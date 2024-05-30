package Controlador;


import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


import Modelo.Cuenta;

public class CuentasVarias
{
	//Clase CuentasVarias donde podremos encontrar los metodos.
    
	private List<Cuenta> cuentasBancarias = new LinkedList<>();/*   Creacion de una coleccion de cuentas para poder trabajar 
																 	sobre ellas, en este caso la coleccion es LinkedList   */

	
	 public void crearCuenta(Cuenta c) //Metodo crearCuenta objeto nuevo de Cuenta = c
	 {
        // Verificar si el código identificativo ya está en uso
        if (buscarCuentaPorCodigo(c.getCod()) == null) 
        {
            cuentasBancarias.add(c);//Añadimos a nuestra coleccion cuentasBancarias nuestra cuenta c
            System.out.println("Cuenta registrada con éxito.");
        } 
        else//Si no se cumple la condicion que al buscarCuentaPorCodigo = null mandará un msg de que ya existe una cuenta con ese cod por lo tanto no la creará.
        {
            System.out.println("Ya existe una cuenta con este código identificativo. No se pudo crear la cuenta.");
        }
    }
	 
	 
	private Cuenta buscarCuentaPorCodigo(String codigo) //Creacion del metodo buscarCuentaPorCodigo.
	{
		for (Cuenta cuenta : cuentasBancarias) //Iteramos entre cuentas para poder buscar Cuentas
	    {
			if (cuenta.getCod().equals(codigo)) //Si el codigo creado introducido coincide devolvemos cuenta
	        {
	           return cuenta;
	        }
	    }
	  return null; 
	}

	
	public void leerCuenta(String codigo)
	{
		for(Cuenta cuenta : cuentasBancarias)//Iteramos entre nuestra coleccion de cuentas buscando los obj cuenta
		{
			if(cuenta.getCod().equals(codigo))//Si el codigo de cuenta introducido en el main coincide con el codigo de una cuenta creada de nuestra coleccion hace la siguiente funcion
			{
				System.out.println(cuenta.toString());//En este caso escribe el toString
			}
			else
			{
				System.out.println("No se encontró el codigo de esa cuenta");
			}
		}
		if(cuentasBancarias.size() == 0)//Si no existe ninguna cuenta saldra el msg posterior, para que tengamos que crear una cuenta para poder leer,borrar o acutalizar cuentas.
		{
			System.out.println("No hay cuentas agregadas en el banco en este momento");
		}
	}
	
		
	public void eliminarCuenta(String codigo)
	{
		
		for(Cuenta cuenta : cuentasBancarias)//Iteramos entre nuestra coleccion de cuentas buscando los obj cuenta.
		{
			if(cuenta.getCod().equals(codigo))//Si el codigo de cuenta introducido en el main coincide con el codigo de una cuenta creada de nuestra coleccion hace la siguiente funcion
			{
				cuentasBancarias.remove(cuenta);//En este caso se elimina la cuenta de la coleccion
				System.out.println("La cuenta con codigo " + codigo + " se ha eliminado correctamente");
			}
			else
			{
				System.out.println("No se encontró una cuenta con ese codigo");
			}
		}
		
		if(cuentasBancarias.size() == 0)//Si no existe ninguna cuenta saldra el msg posterior, para que tengamos que crear una cuenta para poder leer,borrar o acutalizar cuentas.
		{
			System.out.println("No hay cuentas agregadas en el banco en este momento");
		}

	}
	
	
	public void actualizarCuenta(String codigo, String nuevoNombre, String nuevoNumero, double nuevoSaldo) //Creción del metodo actualizarCuenta pidiendo los datos cod, nuevoNombre...
	{
		for (Cuenta cuenta : cuentasBancarias)//Iteramos entre nuestra coleccion de cuentas buscando los obj cuenta.
		{
			if (cuenta.getCod().equals(codigo))//Si el codigo de cuenta introducido en el main coincide con el codigo de una cuenta creada de nuestra coleccion hace la siguiente funcion.
			{
				cuenta.setNombreCuenta(nuevoNombre);
	            cuenta.setNumCuenta(nuevoNumero);
	            cuenta.setSaldo(nuevoSaldo);
	            //En este caso modificamos con los nuevos datos introducidos los datos anteriormente creados mediante cuenta.setAtributo(nuevoAtributo)
	            
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
	
	
	public void guardarCuenta()//Metodo guardar cuenta
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
