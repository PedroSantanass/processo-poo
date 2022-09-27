package javacomopeu;

public class MedicaoQualidadeAr {
	
	private int idMedicao;
	private String classificacao;
	private int indice;
	
		public String definirClassificacao(){	

			//declarando os atributos 
			
			this.classificacao = classificacao;
			
			//Estabelecendo as condicões
			
			if (indice <= 50 ) { classificacao = "boa";}
			
			else if(indice <= 101) {classificacao = "regular";} 
			
			else if(indice <= 199) {classificacao = "indadequada";}
			
			else if(indice <= 299) {classificacao = "má";}
			
			else if(indice <= 399) {classificacao = "péssima";}
			
			else{classificacao = "crítica";}

			//fim das condicionais
			
			return classificacao;	
		}
	
			//getters e setters

	public int getIdMedicao() {return idMedicao;}
	
	public void setIdMedicao(int idMedicao) {this.idMedicao = idMedicao;}
	
	public String getClassificacao() {return classificacao;}

	public int getIndice() {return indice;}

	public void setIndice(int indice) {this.indice = indice;}
	
	
}
