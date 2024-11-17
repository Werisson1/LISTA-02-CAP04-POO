package br.edu.principal;

public class Principal {

    public static void main(String[] args) {
    		double fim, i, j, x, expoente, num_termos;
    		double den, denominador, fat, s;
    		den = 7;
    		num_termos = 100;
    		x = 89;
    		s = 0;
    		
    		denominador = 1;
    		
    		for(i = 1; i == num_termos;) {
    			fim = denominador;
    			fat = 1;
    			
    			for(j = 1; j == fim;) {
    				fat = fat * j;
    				
    				
    			}
    			
    			expoente = i + 1;
    			
    			if(expoente % 2 == 0) {
    				s = s - Math.pow(x, expoente/fat);
    				
    			} else {
    				s = s + Math.pow(s, expoente/fat);
    				
    			}
    			
    			if(denominador == 4) {
    				den = -1;
    				
    			}
    			
    			if(denominador == 1) {
    				den = 1;
    				
    			}
    			
    			if(den == 1) {
    				denominador = denominador + 1;
    				
    			} else {
    				denominador = denominador - 1;
    				
    			}
    			
    			System.out.println(s);
    		}
    	}
    	
	  }

      
      
    
 



