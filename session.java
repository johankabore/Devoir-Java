package entities;

public class session {
    private int id;
    private String date;
    private int heureDb;
    private int heureFin;
    public session() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public int getHeureDb() {
        return heureDb;
    }
    public void setHeureDb(int heureDb) {
        this.heureDb = heureDb;
    }
    public int getHeureFin() {
        return heureFin;
    }
    public void setHeureFin(int heureFin) {
        this.heureFin = heureFin;
    }

    
}
