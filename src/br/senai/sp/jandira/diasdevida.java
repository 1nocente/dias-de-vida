package br.senai.sp.jandira;

import java.util.Scanner;

public class diasdevida {
	
public static void main(String[] args) {
	        
	        // Definição do Scanner para captura de teclado
	        Scanner idade = new Scanner(System.in);
	        
	        
	        // Operação soma
	        
	        // Criação das variáveis utilizáveis no programa
	        double a; // Declaramos a variável, mas não inicializamos
	        System.out.println("insira sua idade");
	        a = idade.nextDouble(); // Inicializamos a variável
	        double b = 365; // Declaramos e inicializamos a variável
	        
	        
	        double resultado = a * b;
	        System.out.println("Você viveu aproximadamente " + resultado + " 1dias");
	    }

}