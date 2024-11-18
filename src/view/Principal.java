package view;

import controller.ArvoreController;

public class Principal {

	public static void main(String[] args) {

		ArvoreController cont=new ArvoreController();
		
		int []vet= {30,15,60,10,20,40,80};
		
		cont.atravessar(vet);
		
	}

}
