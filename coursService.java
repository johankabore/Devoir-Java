package services;
import entities.cours;
import entities.professeur;

import java.util.ArrayList;

import core.services;

public class coursService implements services<cours>{

    private int id;
    cours cours;
    ArrayList<cours> listeCours = new ArrayList<>();
    ArrayList<cours> coursList = new ArrayList<>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public void save(cours cours) {
        listeCours.add(cours);
    }

    @Override
    public ArrayList<cours> getBy(prof) {
        for (cours cours : listeCours) {
            if (cours.getProf().equals(prof)) {
                coursList.add(cours);
            }
        }
        return coursList;
    }

    
}
