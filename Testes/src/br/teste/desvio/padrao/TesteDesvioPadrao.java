package br.teste.desvio.padrao;

public class TesteDesvioPadrao{
	  public static void main(String args[]){
	    // conjunto dos dados
	    double conjunto[] = {10, 30, 90, 30};
	    double soma = 0.0; // soma dos elementos
	    double desvioPadrao = 0.0; // desvio padr�o
	    int tam = conjunto.length; // tamanho dos dados
	    System.out.println(tam);
	    // vamos somar todos os elementos
	    for(int i = 0; i < tam; i++){
	      soma = soma + conjunto[i];
	    }
	 
	    // agora obtemos a m�dia do conjunto de dados    
	    double media = soma / tam;
	 
	    // e finalmente obtemos o desvio padr�o
	    for(int i = 0; i < tam; i++){
	      desvioPadrao = desvioPadrao + Math.pow(conjunto[i] - media, 2);
	    }
	     
	    // mostramos o resultado
	    System.out.println("Desvio Padr�o Amostral: " + 
	      Math.sqrt(desvioPadrao / tam));
	    System.out.println("Desvio Padr�o Populacional: " + 
	      Math.sqrt(desvioPadrao / (tam - 1)));
	  }
	}