package EJER6;

public class GatoArrayList 
{
	 private String nombre;
	 private int edad;

	 public GatoArrayList(String nombre, int edad) throws GatoExceptionA 
	 {
	     this.setNombre(nombre);
	     this.setEdad(edad);
	 }

	 
	 
	 public String getNombre() 
	 {
		 return nombre;
	 }

	 public void setNombre(String nombre) throws GatoExceptionA 
	 {
	     if (nombre.length() >= 3) 
	     {
	       this.nombre = nombre;
	     } 
	     
	     else 
	     {
	       throw new GatoExceptionA(nombre);
	     }
	 }

	 
	 public int getEdad()
	 {
		 return edad;
	 }

	 public void setEdad(int edad) throws GatoExceptionA 
	 {
		 if (edad >= 0) 
		 {
			 this.edad = edad;
		 } 
	    
		 else 
		 {
			 throw new GatoExceptionA(edad);
		 }
	 }

	 
	 public void imprimirDatosGato()
	 {
	        System.out.println("Nombre del gato: " + this.nombre);
	        System.out.println("Edad del gato: " + this.edad);
	 }
	 
	 
}   
	

