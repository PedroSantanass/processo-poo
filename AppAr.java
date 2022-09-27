package javacomopeu;
import java.util.Scanner;

public class AppAr {
		public static void main(String[] args) {
			
			//Criando o scanner para receber a leitura do usuário

			Scanner lerTeclado = new Scanner(System.in);
			
			//Instanciando o objeto na classe principal 

			MedicaoQualidadeAr medicaoQualidadeAr = new MedicaoQualidadeAr();
			
			//recebendo a 1ª entrada do usuário

			System.out.println("Digite sua medicao mais recente:");
			int indice= lerTeclado.nextInt();
			
			//recebendo a 2ª entrada do usuário
			
			System.out.println("Digite o id da sua medicao mais recente:");
			int idMedicao = lerTeclado.nextInt();
			
			//exibindo os Sets

			medicaoQualidadeAr.setIndice(indice);
			medicaoQualidadeAr.setIdMedicao(idMedicao);
			
			//retorno da qualidade do Ar

	System.out.printf("\nSua qualidade do ar é: %s", medicaoQualidadeAr.definirClassificacao());

	}
