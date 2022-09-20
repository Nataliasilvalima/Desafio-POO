package exercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Listas {
	public static void main(String [] args) {
	    List<Pessoa> pessoas = new ArrayList<>(){{
			add(new Pessoa("Joao", 15));
			add(new Pessoa("Leandro", 21));
			add(new Pessoa("Paulo", 17));
			add(new Pessoa("Jessica", 18));
		    }};
		    
	//Ex4 - Exibindo a pessoa com a maior idade
	Collections.sort(pessoas);
	System.out.println(pessoas);
	System.out.println("A pessoa com a maior idade e "+ Collections.max(pessoas));
	System.out.println("A pessoa com a menor idade e "+ Collections.min(pessoas));
		
	//Ex05 - Removendo pessoas com idade inferior a 18
	System.out.println(pessoas);
	
	Iterator<Pessoa> iterator1 = pessoas.iterator();
    while(iterator1.hasNext()){
        Pessoa next = iterator1.next();
        if(next.getIdade() < 18) iterator1.remove();
    }
	
    System.out.println(pessoas);
    
    //Ex06 - Consulte o objeto Jessica existe.
	for (Pessoa pessoa : pessoas) {
		if(Objects.equals(pessoa.getNome(), "Jessica")) {
			 System.out.print(pessoa.getIdade());
		 	};
	}
		
		
		}   	
	}
