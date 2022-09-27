package javacomopeu;

import java.util.Scanner;

public class FonteApp {

	public static void main(String[] args) {
		Fonte[] fonte = new Fonte[3];
		Scanner lerTeclas = new Scanner(System.in);
		
		String desc;
		int cod;
		double custo;
		
		
		
		for(int i = 0; i < fonte.length; i++) {
			System.out.printf("\nDigite o codigo do %dº de identificação do produto", i+1);
			System.out.printf("\nDigite a descrição do %dº produto: ex: agua indaiá 300ml", i+1);
			System.out.printf("\nDigite o preço do %dº produto", i+1);
			
			cod = lerTeclas.nextInt();
			
			lerTeclas.nextLine();
			
			desc = lerTeclas.next();
			
			custo = lerTeclas.nextDouble();
			
			fonte[i] = new Fonte(cod, desc, custo);		
				 
			lerTeclas.close();
			
		}
	}

}

