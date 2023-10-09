package ejercicio2real;

import java.util.Scanner;

public class ejercicio2real {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//EJERCICIO 1
		
		System.out.println("Buenos dias clasee!!");
					
						
//EJERCICIO 2
					
		int a  =  5;
		int area_a  =  a * a;  
		
		System.out.println("El area de un cuadrado de lado 5 es " + area_a + "cm^2.");


//EJERCICIO 3
		
		Scanner entrada  = new Scanner(System.in);//ESTE SCANNER SIRVE PARA Todo el ejercicio ATENTO	
	
		System.out.println("Introduce el lado del cuadrado");
		
		int lcuad  =  entrada.nextInt();
		int area1  =  lcuad*lcuad;
		
		System.out.println("El area de lado " + area1 + "cm^2.");
	

//EJERCICIO 4
	
		System.out.println("Introduce el nºa");
		int numa  =  entrada.nextInt();
		
		System.out.println("Introduce el nºb");
		int numb  = entrada.nextInt();
		
		System.out.println("Sabiendo q el nºa es " + numa + " y "
				+ "el nºb es " + numb + " la suma de ambos es " + (numa+numb) + ""
				+ ", su resta es " + (numa-numb) + ", el producto " + (numa*numb) +""
				+ " y su cociente " + (numa/numb) ); 
		
//EJERCICIO 5
		
		System.out.println("Introduce el valor del radio ");
		
		int radiocirc  =  entrada.nextInt();
		double lcirc  =  2  *  Math.PI  *  radiocirc;
		double acirc  =  Math.PI  *  Math.pow(radiocirc, 2);  //radiocirc * radiocirc
		double volesf  =  4  *  Math.PI  *  Math.pow(radiocirc, 2);
		
		System.out.println("Sabiendo que el radio de la circunferencia "
				+  "es " + radiocirc + " cm ,la longitud de circunferencia son " + (lcirc) + ""
				+  " cm, el area del circulo son " + acirc + " cm^2, y el volumen " + volesf + " cm^3");
		
//EJERCICO 6
		
		System.out.println("Introduce el precio inicial de la sudadera ");
		int precio1  =  entrada.nextInt();
		
		System.out.println("Introduce el precio de la sudadera en las rebajas");
		int precio2  =  entrada.nextInt();
		
		double desc  =  (precio2  *  100) / precio1;
		
		System.out.println("Si la sudadera que has comprado costaba " + (precio1) + " € y el con el descuento esta "
				+  " a " + (precio2) + " € el porcentaje de descuento sera del " + (100-desc) + " %");
		
//EJERCICIO 7
		
		System.out.println("Introduce la distancia hasta tu instituto en millas");
		int distmill  =  entrada.nextInt();
		
		double	distmetr  = distmill*1.852;
		
		DecimalFormat formato1  =  new DecimalFormat(" #.00");
		
		System.out.println("Conociendo que la distancia a tu instituto son " + (distmill) + " millas"
				+ " estas equivalen a " +	(formato1.format(distmetr)) + " metros");
		
//EJERCICIO 8 descarga
		
		System.out.println("Introduce el numero a");
		int num_a  =  entrada.nextInt();
		
		System.out.println("Introduce el numero b");
		int num_b  =  entrada.nextInt();
		
		System.out.println("Sfsfsefes");
		
//EJERCICIO 11
		
		
		double a2;
		double b2;
		
		System.out.println("Introduce el numero a");
		a2  =  entrada.nextInt();
		
		System.out.println("Introduce el numero b, recuerda que b>a");
		b2  =  entrada.nextInt();
		
		
		double suma = (a2+b2);
		double resta  =  (a2-b2);
		double prod  =  (a2*b2);
		double div  =  (a2/b2);
		
		System.out.println("Con a = " + a2 + " y b = " + b2 + "	la	suma vale " + (suma) + "	su "
				+ "resta vale " + (resta) + "  el producto es " + (prod) + "	y la division " + (div));
		
		
//EJERCICIO 12
		
		System.out.println("Introduce el numero a");
		double a3  =  entrada.nextDouble();
	
		System.out.println("Introduce el numero b");
		double b3  =  entrada.nextDouble();
		
		
		System.out.println("Dados los numeros a" + a3 + "y b " + b3 + " el mayor es " +	Math.max(a3,b3));
		
	}

}
