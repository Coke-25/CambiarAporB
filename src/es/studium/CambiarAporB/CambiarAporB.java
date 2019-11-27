package es.studium.CambiarAporB;

import java.util.Scanner;

public class CambiarAporB 
{

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		String a;
		System.out.println("Introduce una palabra:");
		a = teclado.next();
		
		System.out.println(a.replace('a','o'));
		teclado.close();
	}

}
