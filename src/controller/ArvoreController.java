package controller;

import br.edu.fateczl.arvore_int.Arvore;

public class ArvoreController {
	
	public ArvoreController() {
		super();
	}
	
	public void atravessar(int[]vet) {
		Arvore arvore=new Arvore();
		
		for(int elemento:vet) {
			arvore.Insert(elemento);
		}
		System.out.println("Arvore preenchida");
		
		arvore.remove(60);
		System.out.println("\n60 Removido");
		
		try {
			System.out.println("\nAtravessameto em ordem :");
			arvore.infixSearch();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
