import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GestionMain {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Bienvenidos a la gestoria");
		System.out.println("---------------------------------");
		
		
		System.out.println("Creacion de su empresa:");
		
		System.out.println("Introduzca el nombre de su empresa");
		String nombreEmpresa = entrada.nextLine();
		
		
		System.out.println("Introduzca el CIF de su empresa");
		String CIF = entrada.nextLine();
		Pattern pat1 = Pattern.compile("[A-Z]{1}[0-9]{10}");
	    pat1.matcher(CIF);
	    Matcher mat1 = pat1.matcher(CIF);
	    while(!mat1.matches())
	    {
	        System.out.println("CIF no válido. Introduzcalo de nuevo: (EJEMPLO --> A1234567890) ");
	        CIF= entrada.next();
	        mat1 = pat1.matcher(CIF);
	    }
	    
	    entrada = new Scanner(System.in);
	    
		System.out.println("Introduzca la fecha de fundacion de su empresa (YYYY-MM-DD)");
		LocalDate fechaFundacion =  LocalDate.parse(entrada.nextLine());
		
		
		Empresa empresa = new Empresa(nombreEmpresa, CIF, fechaFundacion, null);
		
		
		int seleccionar;
		boolean salir = false;
		
		do 
		{
			System.out.println("1.Registrar Trabajador en la Empresa");
			System.out.println("2.Mostrar Informacion de la empresa");
			System.out.println("3.Mostrar el número de trabajadores actuales y el organigrama de la empresa.");
			System.out.println("4.Mostrar informacion de un departamento");
			System.out.println("5.Eliminar trabajador de la empresa");
			System.out.println("6.Agenda Director");
			System.out.println("7.Salir de la aplicacion");
			System.out.println("Selceccione una opcion del menu escogiendola por su numero");
			seleccionar = entrada.nextInt();
			
			switch(seleccionar)
			{
				case 1:
						entrada.nextLine();
						System.out.println("Registrando trabajador en la empresa...");
						System.out.println("1.Registrar director");
						System.out.println("2.Registrar gerente de Departamento");
						System.out.println("3.Registrar trabajador normal");
						System.out.println("Selceccione una opcion del menu escogiendola por su numero ");
						int seleccionarCase = entrada.nextInt();
						
						switch(seleccionarCase)
						{
							case 1:
								entrada.nextLine();
								System.out.println("Registrando Director...");
								
								System.out.println("Introduzca el nombre del Director");
								String nombreDirector = entrada.nextLine();
								
								System.out.println("Introduzca la fecha de nacimiento del Director (YYYY-MM-DD)");
								LocalDate fechaDeNacimientoDirector =  LocalDate.parse(entrada.nextLine());
								
								System.out.println("Introduzca el DNI del Director");
								String DNIdirector = entrada.nextLine();
						    	Pattern pat2 = Pattern.compile ("^[0-9]{8}[A-Z]{1}");
						    	pat2.matcher(DNIdirector);
								Matcher mat2 = pat2.matcher(DNIdirector);
								while(!mat2.matches())
								{	 
							     System.out.println("DNI no válido. Introduzcalo de nuevo: (EJEMPLO --> 72178507E) ");
							     DNIdirector = entrada.nextLine();
							     mat2 = pat2.matcher(DNIdirector);    
							    }
								
								entrada = new Scanner(System.in);
								
								System.out.println("Introduzca la direccion del Director");
								String direccionDirector = entrada.nextLine();
								
								
								System.out.println("Introduzca el numero de la seguridad social del Director");
								String numeroSSdirector = entrada.nextLine();
								Pattern pat10 = Pattern.compile ("[0-9]{10}");
						    	pat10.matcher(numeroSSdirector);
								Matcher mat10 = pat10.matcher(numeroSSdirector);
								while(!mat10.matches())
								{	 
							     System.out.println("NumeroSS no válido. Introduzcalo de nuevo: (EJEMPLO --> 1234567890) ");
							     numeroSSdirector = entrada.nextLine();
							     mat10 = pat10.matcher(numeroSSdirector);    
							    }
								 entrada = new Scanner(System.in);
								
								System.out.println("Introduzca el email del Director");
								String emailDirector = entrada.nextLine();
								
								
								System.out.println("Introduzca el salario del Director");
								Double salarioDirector = entrada.nextDouble();
								
								
								System.out.println("Esta en la oficina el Director (true/fasle)");
								boolean isOficinaDirector = entrada.nextBoolean();
								
								entrada = new Scanner(System.in);
								
								System.out.println("Numero de telefono del Director");
								String numeroTelefonoDirector = entrada.nextLine();
								Pattern pat6 = Pattern.compile ("^[6,7,9][0-9]{8}");
						    	pat6.matcher(numeroTelefonoDirector);
								Matcher mat6 = pat6.matcher(numeroTelefonoDirector);
								while(!mat6.matches())
								{	 
							     System.out.println("Numero de telefono no válido. Introduzcalo de nuevo: (EJEMPLO --> 658129122) ");
							     numeroTelefonoDirector = entrada.nextLine();
							     mat6 = pat6.matcher(numeroTelefonoDirector);    
							    }
								 entrada = new Scanner(System.in);
								
								Director director = new Director(nombreDirector, fechaDeNacimientoDirector, DNIdirector, direccionDirector, numeroSSdirector, emailDirector, null,  salarioDirector, isOficinaDirector, numeroTelefonoDirector);
		                        empresa.registrarDirector(director);
								
							break;
							
							
							case 2:
								entrada.nextLine();
								System.out.println("Registrando Gerente de Departamento...");
								
								System.out.println("Introduzca el nombre del Gerente de Departamento");
								String nombreGerenteDep = entrada.nextLine();
								
								
								System.out.println("Introduzca la fecha de nacimiento del Gerente de Departamento (YYYY-MM-DD)");
								LocalDate fechaDeNacimientoGerenteDep =  LocalDate.parse(entrada.nextLine());
								
								
								System.out.println("Introduzca el DNI del Gerente de Departamento");
								String DNIgerenteDep = entrada.nextLine();
								Pattern pat3 = Pattern.compile ("^[0-9]{8}[A-Z]{1}");
						    	pat3.matcher(DNIgerenteDep);
								Matcher mat3 = pat3.matcher(DNIgerenteDep);
								while(!mat3.matches())
								{	 
							     System.out.println("DNI no válido. Introduzcalo de nuevo: (EJEMPLO --> 72178507E) ");
							     DNIgerenteDep = entrada.nextLine();
							     mat3 = pat3.matcher(DNIgerenteDep);    
							    }
								 entrada = new Scanner(System.in);
								
								System.out.println("Introduzca la direccion del Gerente de Departamento");
								String direccionGerenteDep = entrada.nextLine();
								
								
								System.out.println("Introduzca el numero de la seguridad social del Gerente de Departamento");
								String numeroSSgerenteDep = entrada.nextLine();
								Pattern pat9 = Pattern.compile ("[0-9]{10}");
						    	pat9.matcher(numeroSSgerenteDep);
								Matcher mat9 = pat9.matcher(numeroSSgerenteDep);
								while(!mat9.matches())
								{	 
							     System.out.println("NumeroSS no válido. Introduzcalo de nuevo: (EJEMPLO --> 1234567890) ");
							     numeroSSgerenteDep = entrada.nextLine();
							     mat9 = pat9.matcher(numeroSSgerenteDep);    
							    }
								
								entrada = new Scanner(System.in);
								
								System.out.println("Introduzca el email del Gerente de Departamento");
								String emailGerenteDep = entrada.nextLine();
								
								
								System.out.println("Introduzca el salario del Gerente de Departamento");
								Double salarioGerenteDep = entrada.nextDouble();
								
								entrada = new Scanner(System.in);
								
								System.out.println("Esta en la oficina el gerente de Departamento (true/fasle)");
								boolean isOficinaGerenteDep = entrada.nextBoolean();
								
								entrada = new Scanner(System.in);
								
								System.out.println("Seleccione el tipo de departamento del gerente (Ingrese el nombre del departamento: INFORMATICA, GESTION, MARKETING): ");
	                            String tipoDepartamentoGerente = entrada.nextLine();
	                            Enumerado tipoDepGerente = empresa.obtenerTipoDepartamento(tipoDepartamentoGerente);
	                            
	                            
								System.out.println("Introduzca el numero de telefono del Gerente de Departamento");
								String numeroTelefonoGerenteDep = entrada.nextLine();
								Pattern pat5 = Pattern.compile ("^[6,7,9][0-9]{8}");
						    	pat5.matcher(numeroTelefonoGerenteDep);
								Matcher mat5 = pat5.matcher(numeroTelefonoGerenteDep);
								while(!mat5.matches())
								{	 
							     System.out.println("Numero de telefono no válido. Introduzcalo de nuevo: (EJEMPLO --> 658129122) ");
							     numeroTelefonoGerenteDep = entrada.nextLine();
							     mat5 = pat5.matcher(numeroTelefonoGerenteDep);    
							    }
								entrada = new Scanner(System.in); 
								
	                            GereneteDep gerenteDep = new GereneteDep(nombreGerenteDep, fechaDeNacimientoGerenteDep, DNIgerenteDep, direccionGerenteDep,numeroSSgerenteDep, emailGerenteDep, salarioGerenteDep, isOficinaGerenteDep, tipoDepGerente, numeroTelefonoGerenteDep);
	                             
	                            empresa.registrarGerenteDep(gerenteDep);
	                            
							break;
							
							
							case 3:
								entrada.nextLine();
								System.out.println("Registrando Trabajador Normal...");
								
								System.out.println("Introduzca el nombre del Trabajador Normal");
								String nombreTrabajadorNormal = entrada.nextLine();
								
								System.out.println("Introduzca la fecha de nacimiento del Trabajador Normal (YYYY-MM-DD)");
								LocalDate fechaDeNacimientoTrabajadorNormal =  LocalDate.parse(entrada.nextLine());
								
								System.out.println("Introduzca el DNI del Trabajador Normal");
								String DNItrabajadorNormal = entrada.nextLine();
								Pattern pat4 = Pattern.compile ("^[0-9]{8}[A-Z]{1}");
						    	pat4.matcher(DNItrabajadorNormal);
								Matcher mat4 = pat4.matcher(DNItrabajadorNormal);
								while(!mat4.matches())
								{	 
							     System.out.println("DNI no válido. Introduzcalo de nuevo: (EJEMPLO --> 72178507E) ");
							     DNItrabajadorNormal = entrada.nextLine();
							     mat4 = pat4.matcher(DNItrabajadorNormal);    
							    }
								 entrada = new Scanner(System.in);
								
								System.out.println("Introduzca la direccion del Trabajador Normal");
								String direccionTrabajadorNormal = entrada.nextLine();
								
								System.out.println("Introduzca el numero de la seguridad social del trabajador");
								String numeroSStrabajadorNormal = entrada.nextLine();
								Pattern pat7 = Pattern.compile ("[0-9]{10}");
						    	pat7.matcher(numeroSStrabajadorNormal);
								Matcher mat7 = pat7.matcher(numeroSStrabajadorNormal);
								while(!mat7.matches())
								{	 
							     System.out.println("NumeroSS no valido. Introduzcalo de nuevo: (EJEMPLO --> 1234567890) ");
							     numeroSStrabajadorNormal = entrada.nextLine();
							     mat7 = pat7.matcher(numeroSStrabajadorNormal);    
							    }
								 entrada = new Scanner(System.in);
								
								System.out.println("Introduzca el email del Trabajador Normal");
								String emailTrabajadorNormal = entrada.nextLine();
								
								entrada = new Scanner(System.in);
								
								System.out.print("Seleccione el tipo de departamento del trabajador (INFORMATICA, GESTION, MARKETING): ");
	                            String tipoDepartamentoTrabajador = entrada.nextLine();
	                            Enumerado tipoDepTrabajador = empresa.obtenerTipoDepartamento(tipoDepartamentoTrabajador);
		                             
	                            entrada = new Scanner(System.in);
	                            
	                            
								System.out.println("Introduzca el salario del Trabajador Normal");
								double salarioTrabajadorNormal = entrada.nextDouble();
								
								System.out.println("¿Esta en la oficina el Trabajador Normal? (true/fasle)");
								boolean isOficinaTrabajadorNormal = entrada.nextBoolean();
								
								
								Trabajador trabajadorNormal = new Trabajador(nombreTrabajadorNormal,fechaDeNacimientoTrabajadorNormal, DNItrabajadorNormal, direccionTrabajadorNormal, numeroSStrabajadorNormal, emailTrabajadorNormal, tipoDepTrabajador, salarioTrabajadorNormal, isOficinaTrabajadorNormal);
	                                
		                        empresa.registrarTrabajador(trabajadorNormal);
								
							break;
						}
						
				break;
				
				
				case 2:
						entrada.nextLine();
						empresa.mostrarInformacionGeneral();
						empresa.mostrarOrganigrama();
						
				break;	
					
					
				case 3:
						entrada.nextLine();
						System.out.println("Numero de trabajadores actuales: " + empresa.numeroTrabajadoresActuales());
						empresa.mostrarOrganigrama();
						
				break;	
					
					
				case 4:
					entrada.nextLine();
					System.out.print("Ingrese el nombre del departamento a mostrar:(INFORMATICA, GESTION, MARKETING) ");
	                String departamento = entrada.nextLine();
	                empresa.mostrarInfoDepartamento(departamento);
	                 						
				break;	
					
					
				case 5:
						entrada.nextLine();
						System.out.print("Ingrese el DNI del trabajador a eliminar: ");
	                    String dniEliminar = entrada.nextLine();
	                    empresa.eliminarTrabajador(dniEliminar);
				break;
					
					
				case 6:
						entrada.nextLine();
					    
						if (empresa.getDirector() == null)
						{
					        try 
					        {
					            throw new DirectorNoEncontradoException();
					        }
					        catch (DirectorNoEncontradoException e) 
					        {
					            System.out.println(e.getMessage());
					        }
					       
					    }
						
						else 
						{
							System.out.println("Agenda del director:");
							System.out.println("1. Reunión");
							System.out.println("2. Fuera de la oficina");
							System.out.println("3. Convocar a toda la empresa (fecha)");
							System.out.print("Seleccione una opción: ");
							
							int seleccionCase6 = entrada.nextInt();
							Director director = empresa.getDirector();
							    switch (seleccionCase6)
							    {
								    case 1:
								        entrada.nextLine(); // Consumir el salto de línea pendiente
			
								    break;
								    
								    case 2:
								        	
								    break;
								            
								    case 3:
								        	
								    break;
								        
								    case 4:
								        
								        	 
								    break;	    
							    }
						}
					
				break;		
					
				case 7:
					 System.out.println("Usted salio del programa correctamente");
	                 salir = true;
				break;	
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		while(!salir);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//MAIN

}//CLASE GESTIONMAIN
