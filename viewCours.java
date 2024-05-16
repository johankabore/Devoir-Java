package views;
import entities.cours;

import java.util.Scanner;

import core.views;

public class viewCours implements views<cours>{
    Scanner sc = new Scanner(null);
    public viewCours() {
    }

    public viewCours(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public void afficher() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void saisir() {
        System.out.println("Entrez le libellé ");
        String libelle = sc.nextLine();
    }
    
}
