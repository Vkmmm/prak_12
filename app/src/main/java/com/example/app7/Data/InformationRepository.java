package com.example.app7.Data;
import java.io.Serializable;

public class InformationRepository implements Serializable {
    private String Name;
    private String Town;
    public InformationRepository() {};
    public  InformationRepository(String Name) {
        this.Name = Name;
    }
    public InformationRepository(String Name, String Town) {
        this.Name = Name;
        this.Town = Town;
    }
    public void setName (String Name) {
        this.Name = Name;
    }
    public void setTown(String Town) {
        this.Town = Town;
    }
    public String getName() {
        return Name;
    }
    public String getTown() {
        return Town;
    }
}
