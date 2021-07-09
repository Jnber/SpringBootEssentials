package com.example.crudservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

    @Id
    private String ID;
    private String Name;
    private String Descripton;

    public Topic(String id, String name, String descripton) {
        ID = id;
        Name = name;
        Descripton = descripton;
    }

    public Topic() {

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescripton() {
        return Descripton;
    }

    public void setDescripton(String descripton) {
        Descripton = descripton;
    }
}
