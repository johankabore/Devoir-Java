package core;

import java.util.ArrayList;
import entities.cours;

public interface services <T>{
    void save(cours cours);
    ArrayList<T> getBy(Object obj);
}
