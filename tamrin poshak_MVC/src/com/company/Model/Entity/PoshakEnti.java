package com.company.Model.Entity;

import com.company.View.PoshakView;

public class PoshakEnti {

    private String name,color;
    private String gheimat,id;



    public String getId() {
        return id;
    }

    public PoshakEnti setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PoshakEnti setName(String name) {
        this.name = name;
        return this;
    }


    public String getColor() {
        return color;
    }

    public PoshakEnti setColor(String color) {
        this.color = color;
        return this;
    }

    public String getGheimat() {
        return gheimat;
    }
    public PoshakEnti setGheimat(String gheimat) {
        this.gheimat = gheimat;
        return this;
    }
}
