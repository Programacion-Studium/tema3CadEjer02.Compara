package es.Studium.CadEjer2.Compara;

import java.util.Scanner;

public class Compara {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		nombre(teclado);
	teclado.close();
}

private static void nombre(Scanner teclado) {
	String n1;
	String n2;
	
	System.out.println("Dame la primera cadena");
	n1 = teclado.next();
	
	System.out.println("Dame la segunda cadena");
	n2 = teclado.next();
	
	if(n1.length()==n2.length())
	{
		System.out.println("Las cadenas son iguales");
	}
	else if (n1.length()<n2.length())
	{
		System.out.println("Las cadena \""+n2+"\" es mayor"); //dentro de una cadena si ponemos \" nos aparecen "
	}
	else
	{
		System.out.println("Las cadena \""+n1+"\" es mayor");//dentro de una cadena si ponemos \" nos aparecen "
	}
	}

}
