package org.livecoding5;

import java.util.Scanner; //importar el scanner

public class Codigo5 {
	public static void main(String[]args) { //Creacion del metodo main
	Scanner s = new Scanner(System.in);//System.In para las entradas
	
    System.out.println("Introduzca un número: "); //correccion de las comillas y println
    int ni = s.nextInt(); //colocar int para que el scanner reciba valor numerico
    
    int c = ni;
    int afo = 0;
    int noAfo = 0;
    
    while (ni > 0) {
	  int digito = ni % 10; // ya no es necesario remarcar el int, ya que el scanner solo recibe valores numericos enteros
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afo++;
      } else {
		noAfo++;
	  
      }
	  ni /= 10; //sacar de la llave 
    
    
    }
    if (afo > noAfo) {
      System.out.println("El " + c + " es un número afortunado."); //falta t en println
    } else {
      System.out.println("El " + c + " no es un número afortunado.");
    
    }
  
  
    s.close(); //cerrar el scaner 
	}
	
}

