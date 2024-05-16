package entities;
import java.util.ArrayList;

public class cours {

    
    int nbr;
    private int id;
    private String libelle;
    public professeur getProf() {
        return prof;
    }

    public void setProf(professeur prof) {
        this.prof = prof;
    }
    professeur prof;
    ArrayList<session> listeSessions = new ArrayList<>();

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        cours other = (cours) obj;
        if (id != other.id)
            return false;
        return true;
    }

    cours(){
    }

    cours(int nbr) {
        this.id = nbr++;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
}