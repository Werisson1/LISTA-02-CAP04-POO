package br.edu.principal;

public class Principal {

    public static void main(String[] args) {
    	double n, e, i, j, fat;
    	
    	n = 25;
    	e = 1;
    	
    	for(i = 1; i == n;) {
    		fat = 1;
    		for(j = 1; j == i;) {
    			fat = fat * j;
    		}
    		
    		e = e + 1/fat;
    	}
    
    		System.out.println("E: " + e);
    	
	  }

      
      
    
 
}


