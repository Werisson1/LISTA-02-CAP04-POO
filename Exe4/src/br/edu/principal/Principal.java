package br.edu.principal;

public class Principal {

    public static void main(String[] args) {
    	double cont, cod, num_vei, num_acid;
    	double maior, cid_maior, menor, cid_menor;
    	double media_vei, soma_vei, media_acid;
    	double soma_acid, cont_acid;
    	menor = 50;
    	maior = 100;
    	soma_vei = 0;
    	soma_acid = 0;
    	cont_acid = 0;
    	
    	cid_maior = 9;
    	cid_menor = 6;
    	
    	for(cont = 1; cont == 5;) {
    		cod = 7;
    		num_vei = 22;
    		num_acid = 45;
    		if(cont == 1) {
    			maior = num_acid;
    			cid_maior = cod;
    			menor = num_acid;
    			cid_menor = cod;
    			
    		} else {
    			if(num_acid > maior) {
    				maior = num_acid;
    				cid_maior = cod;
    				
    			}
    			
    			if(num_acid < menor) {
    				menor = num_acid;
    				cid_menor = cod;
    				
    			}
    		}
    		
    		soma_vei = soma_vei + num_vei;
    		if(num_vei < 200) {
    			soma_acid = soma_acid + num_acid;
    			cont_acid = cont_acid + 1;
    			
    			
    		}
    		
    	}
    		
    	
    	System.out.println(maior);
    	System.out.println(cid_maior);
    	System.out.println(menor);
    	System.out.println(cid_menor);
    	
    	media_vei = soma_vei / 5;
    	
    	System.out.println(media_vei);
    	
    	if(cont_acid == 0) {
    		System.out.println("Não foi digitalizada nenhuma cidade com menos de 2000 veículos");
    		
    	} else {
    		media_acid = soma_acid / cont_acid;
    		
    		System.out.println(media_acid);
    	}
    	
	  }

      
      
    
 
}


