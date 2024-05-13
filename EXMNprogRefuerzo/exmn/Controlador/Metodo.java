package exmn.Controlador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import exmn.Modelo.Empresa;

public class Metodo
{   
   public void inicio()
   {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Creando Empresa...");
        
        System.out.println("Introduzca el CIF de la empresa (EJ--->X1234567890)");
        String numCIF = entrada.next("[A-Z]{1}[0-9]{10}");
        //Necesito excepcion1

        entrada.nextLine();
        System.out.println("Introduzca el nombre de la empresa");
        String nombreEmpresa = entrada.nextLine();

        entrada.nextLine();
        System.out.println("Introduzca la fecha de la fundacion de la empresa (EJ--->01/01/2001)");
        String fecha = entrada.nextLine();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate fechaFundacion = LocalDate.parse (fecha, dateFormat);
        //Necesito excepcion2

        Empresa empresa = new Empresa (nombreEmpresa, numCIF, fechaFundacion);
        System.out.println("empresa " + empresa);

        menu();

        entrada.close();

    }


    public void menu()
    {
        System.out.println("0. Visualizar Menu");
        System.out.println("1. Registrar Trabajador");
        System.out.println("2. Mostrar información");
        System.out.println("3. Mostrar nº trabajdores y onigrama");
        System.out.println("4. Mostrar Informacion del departamento");
        System.out.println("5. Eliminar Trabajador");
        System.out.println("6. Agenda Director");
        System.out.println("7. Salir de la Aplicacion");
    }
}