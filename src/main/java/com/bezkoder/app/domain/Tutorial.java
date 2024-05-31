package com.bezkoder.app.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tutorials")
public class Tutorial {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "tittle")
    private String tittle;

    @Column(name = "description")
    private String description;

    @Column(name= "published")
    private boolean published;

    public Tutorial(){

    }

    
    public Tutorial(String tittle, String description, boolean published ){
        this.tittle = tittle;
        this.description = description;
        this.published = published;
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getTittle() {
        return tittle;
    }


    public void setTittle(String tittle) {
        this.tittle = tittle;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public boolean isPublished() {
        return published;
    }


    public void setPublished(boolean published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", tittle=" + tittle + ", description=" + description + ", published=" + published
                + "]";
    }
    
    
}
