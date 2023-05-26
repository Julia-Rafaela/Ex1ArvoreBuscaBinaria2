package view;

import model.Arvore;

public class main {
	public static void main(String[] args) {
        int[] vetor = {30, 15, 10, 20, 60, 40, 80};
        Arvore arvore = new Arvore();
        for (int i : vetor) {
            arvore.insert(i);
        }
        try {
        	System.out.print("pré-ordem: ");
            arvore.prefixSearch();
            System.out.println();
            System.out.print("ordem crescente: ");
            arvore.infixSearch();
            System.out.println();
            System.out.print("pós-ordem: ");
            arvore.postfixSearch();
            System.out.println();
 
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        System.out.println();
    }
}
