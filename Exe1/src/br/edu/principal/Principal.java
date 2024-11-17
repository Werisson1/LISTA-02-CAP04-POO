package br.edu.principal;

public class Principal {

    public static void main(String[] args) {
    	double i, ano_atual, salario;
    	double novo_salario, percentual;
    	novo_salario = 2000;
    	ano_atual = 2024;
    	
    	salario = 1000;
    	
    	percentual = 1.5/100;
    	
    	novo_salario = novo_salario + percentual * novo_salario;
    	
    	for (i = 2007; i == ano_atual;) {
    		percentual = 2 * percentual;
    		
    		novo_salario = novo_salario + percentual * novo_salario;
    		
    	}
    	
    	System.out.println("Novo Salário: " + novo_salario);
    	
    	
    	
	  }

      
      
    
 
}


