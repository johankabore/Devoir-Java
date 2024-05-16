package entities;

public class professeur extends personne{
    private int id;
    private String codeProf;
    public professeur() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCodeProf() {
        return codeProf;
    }
    public void setCodeProf(String codeProf) {
        this.codeProf = codeProf;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codeProf == null) ? 0 : codeProf.hashCode());
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
        professeur other = (professeur) obj;
        if (codeProf == null) {
            if (other.codeProf != null)
                return false;
        } else if (!codeProf.equals(other.codeProf))
            return false;
        return true;
    }

    
}
